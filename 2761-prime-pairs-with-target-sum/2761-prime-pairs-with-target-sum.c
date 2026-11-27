bool* sieveOfEratosthenes(int n) {
    bool* isPrime = malloc((n + 1) * sizeof(bool));
    for (int i = 0; i <= n; i++) {
        isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    
    for (int p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (int i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }
    return isPrime;
}

int** findPrimePairs(int n, int* returnSize, int** returnColumnSizes) {
    // Step 1: Precompute primes up to n using a sieve
    bool* isPrime = sieveOfEratosthenes(n);
    
    int** list = malloc((n / 2 + 1) * sizeof(int*));
    *returnColumnSizes = malloc((n / 2 + 1) * sizeof(int));
    *returnSize = 0;
    
    // Step 2: Iterate and check in O(1) time
    for (int i = 2; i <= n / 2; i++) {
        if (isPrime[i] && isPrime[n - i]) {
            list[*returnSize] = malloc(2 * sizeof(int));
            list[*returnSize][0] = i;
            list[*returnSize][1] = n - i;
            
            (*returnColumnSizes)[*returnSize] = 2;
            (*returnSize)++;
        }
    }
    
    free(isPrime);
    return list;
}