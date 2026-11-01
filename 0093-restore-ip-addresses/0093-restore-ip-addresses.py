class Solution:
    def restoreIpAddresses(self, s: str) -> list[str]:
        res = []
        
        # An IP address cannot have more than 12 digits or fewer than 4 digits
        if len(s) < 4 or len(s) > 12:
            return res
            
        def backtrack(start_idx: int, path: list[str]):
            # If we have 4 segments and we've used all characters, it's a valid IP
            if len(path) == 4:
                if start_idx == len(s):
                    res.append(".".join(path))
                return
            
            # Try taking 1, 2, or 3 digits for the current segment
            for length in range(1, 4):
                if start_idx + length > len(s):
                    break
                
                segment = s[start_idx:start_idx + length]
                
                if (segment.startswith('0') and len(segment) > 1) or int(segment) > 255:
                    continue
                
                # Recurse with the next segment
                backtrack(start_idx + length, path + [segment])

        backtrack(0, [])
        return res