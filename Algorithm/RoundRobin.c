#include <stdio.h>
#include <stdbool.h>

struct Process
{
    int PID;
    int arrivalTime;
    int burstTime;
    int remainingTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;
};

void calculateTime(struct Process proc[], int n, int quantum)
{
    int time = 0;
    int completed = 0;
    bool done = false;

    while (completed < n)
    {
        done = true;
        for (int i = 0; i < n; i++)
        {
            if (proc[i].remainingTime > 0 && proc[i].arrivalTime <= time)
            {
                done = false;
                if (proc[i].remainingTime > quantum)
                {
                    time += quantum;
                    proc[i].remainingTime -= quantum;
                }
                else
                {
                    time += proc[i].remainingTime;
                    proc[i].remainingTime = 0;
                    proc[i].completionTime = time;
                    proc[i].turnaroundTime = proc[i].completionTime - proc[i].arrivalTime;
                    proc[i].waitingTime = proc[i].turnaroundTime - proc[i].burstTime;
                    completed++;
                }
            }
        }
        if (done)
        {
            time++;
        }
    }
}

void avgTime(struct Process proc[], int n)
{
    int avgtWait = 0;
    int avgTAT = 0;
    for (int i = 0; i < n; i++)
    {
        avgtWait += proc[i].waitingTime;
        avgTAT += proc[i].turnaroundTime;
    }

    printf("\nAverage Waiting Time : %.2f\n", (float)avgtWait / n);
    printf("Average Turnaround Time : %.2f\n\n", (float)avgTAT / n);
}

void printProcessesTime(struct Process proc[], int n)
{
    printf("P\tAT\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++)
    {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n", proc[i].PID, proc[i].arrivalTime,
               proc[i].burstTime, proc[i].completionTime, proc[i].turnaroundTime, proc[i].waitingTime);
    }
}

void takeInput(struct Process proc[], int *n, int *quanta)
{
    printf("Enter Number of Process : ");
    scanf("%d", n);
    for (int i = 0; i < *n; i++)
    {
        proc[i].PID = i + 1;
        printf("Enter arrival time process %d : ", proc[i].PID);
        scanf("%d", &proc[i].arrivalTime);
        printf("Enter Burst Time of Process %d : ", proc[i].PID);
        scanf("%d", &proc[i].burstTime);
        proc[i].remainingTime = proc[i].burstTime;
    }
    printf("Enter Time Quantum : ");
    scanf("%d", quanta);
}

int main()
{
    int n;
    int quanta;
    struct Process proc[100];
    takeInput(proc, &n, &quanta);
    calculateTime(proc, n, quanta);
    printProcessesTime(proc, n);
    avgTime(proc, n);
}