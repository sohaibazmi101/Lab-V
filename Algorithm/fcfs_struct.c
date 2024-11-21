#include <stdio.h>

struct process
{
    int id;
    int arrivalTime;
    int burstTime;
    int comTime;
    int waitTime;
    int turnaroundTime;
};

void calTimes(struct process proc[], int n)
{
    int currentTime = 0;
    for (int i = 0; i < n; i++)
    {
        if (currentTime < proc[i].arrivalTime)
        {
            currentTime = proc[i].arrivalTime;
        }
        proc[i].comTime = currentTime + proc[i].burstTime;
        proc[i].turnaroundTime = proc[i].comTime - proc[i].arrivalTime;
        proc[i].waitTime = proc[i].turnaroundTime - proc[i].burstTime;
        currentTime = proc[i].comTime;
    }
}

void printProcess(struct process proc[], int n)
{
    printf("P\tAT\tBT\tCT\tWT\tTAT\n");
    for (int i = 0; i < n; i++)
    {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n", proc[i].id, proc[i].arrivalTime,
               proc[i].burstTime, proc[i].comTime, proc[i].waitTime, proc[i].turnaroundTime);
    }
}

int main()
{
    int n;
    printf("Enter number of processes : ");
    scanf("%d", &n);
    struct process proc[n];
    int arrivalTime[n], burstTime[n];

    for (int i = 0; i < n; i++)
    {
        proc->id = i +1;
        printf("Enter Arrival Time for Process %d : ", proc[i].id);
        scanf("%d", &proc[i].arrivalTime);
        printf("Enter Burst Time for Process %d : ", proc[i].id);
        scanf("%d", &proc[i].burstTime);
    }

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (proc[i].arrivalTime > proc[j].arrivalTime)
            {
                struct process temp = proc[i];
                proc[i] = proc[j];
                proc[j] = temp;
            }
        }
    }

    calTimes(proc, n);
    printProcess(proc, n);
    return 0;
}