    #include<bits/stdc++.h>
using namespace std;
    int main(void) {
    // your code goes here
    int t, b, l;
    scanf ("%d", &t);
    while (t--) {
    scanf ("%d %d", &b, &l);
    if (b < l)
    printf ("%f ", sqrt(l * l - b * b));
    else if (b > l)
    printf ("%f ", sqrt(b * b - l * l));
    else
    printf ("%f ", b);
    printf ("%f\n", sqrt(b * b + l * l));
    }
    return 0;
    }
