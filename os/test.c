#include <stdio.h>

int main() {
    int n, i, j;
    float bt[20], wt[20], tat[20];
    float avwt = 0.0, avtat = 0.0;

    printf("Enter total number of processes (maximum 20): ");
    scanf("%d", &n);
    printf("\nEnter Process Burst Time\n");

    for (i = 0; i < n; i++) {
        printf("P[%d]: ", i + 1);
        scanf("%f", &bt[i]);
    }

    wt[0] = 0;

    for (i = 1; i < n; i++) {
        wt[i] = 0;
        for (j = 0; j < i; j++)
            wt[i] += bt[j];
    }

    printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time");

    for (i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
        avwt += wt[i];
        avtat += tat[i];
        printf("\nP[%d]\t%.2f\t\t%.2f\t\t%.2f", i + 1, bt[i], wt[i], tat[i]);
    }

    avwt /= n;
    avtat /= n;

    printf("\n\nAverage Waiting Time: %.2f", avwt);
    printf("\nAverage Turnaround Time: %.2f", avtat);

    return 0;
}
