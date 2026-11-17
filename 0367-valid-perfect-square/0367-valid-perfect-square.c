bool isPerfectSquare(int num) {
    if (num == 0) return false;
    if (num == 1) return true;
    
    long long i = 1; // Use long long to avoid integer overflow during i * i
    while (i <= num / 2) {
        if (i * i == num) {
            return true;
        }
        i++;
    }
    return false;
}