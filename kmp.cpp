#include <iostream>
#include <cstdio>
#include <cstdlib>

using namespace std;

void kmp_();

int main()
{
    char t[1005], p[1005];
    int next[1005], lt, lp, i, j;

    scanf("%s%s", t, p);
    lt = strlen(t);
    lp = strlen(p);
    next[0] = -1;
    j = -1;
    for(i = 1; i < lp; i++){
        while(j >= 0 && p[i] != p[j+1]) j = next[j];
        if(p[i] == p[j+1]) j++;
        next[i] = j;
    }

    j = -1;
    for(i = 0; i < lt; i++){
        while(j >= 0 && t[i] != p[j+1]) j = next[j];
        if(t[i] == p[j+1]) j++;
        if(j == lp - 1) {printf("Matching.\n"); break;}
    }
    kmp_();
}

void kmp_()
{
    char t[1005], p[1005];
    int next[1005], lt, lp, i, j;
    scanf("%s%s", &t[1], &p[1]);
    lt = strlen(&t[1]);
    lp = strlen(&p[1]);
    next[1] = 0;
    j = 0;
    for(i = 2; i <= lp; i++){
        while(j >= 1 && p[i] != p[j+1]) j = next[j];
        if(p[i] == p[j+1]) j++;
        next[i] = j;
    }

    for(i = 1; i <= lt; i++){
        while(j >= 1 && t[i] != p[j+1]) j = next[j];
        if(t[i] == p[j+1]) j++;
        if(j == lp) {printf("Matching position: %d\n", i); j = next[j];}
    }
}
