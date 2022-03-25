package com.company.Bitwise;

public class Seive {
    public static void main(String[] args) {
        int n= 40;
        boolean prime[]= new boolean[n+1];
        sieve(n, prime);
    }


    //false in array means the number is prime
    static void sieve(int n, boolean prime[]){
        for (int i = 2; i*i <= n ; i++) {
            if (!prime[i]){
                for (int j = i*2; j<=n; j+=1){
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]){
                System.out.println(i+" ");
            }
        }
    }
}
