#include<stdio.h>
#include<limits.h>

struct Process{
    int PID;
    int arrivalTime;
    int burstTime;
    int remainingTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;
};

void calculateTime(struct Process proc[], int n){
    int currentTime = 0;
    int completed = 0;
    int shortest = -1;
    int minRemaingTime = INT_MAX;
    int isIdle = 0;

    // To be put in takeInput() function

    for(int i = 0; i < n; i++){
        proc[i].remainingTime = proc[i].burstTime;
    }
    // Till here

    printf("\nExecution Log\n");
    printf("----------------------\n\n");


    while(completed < n){
        for(int i = 0; i < n; i++){
            if(proc[i].arrivalTime < currentTime && proc[i].remainingTime > 0){
                if(proc[i].remainingTime < minRemaingTime){
                    minRemaingTime = proc[i].remainingTime;
                    shortest = i;
                    isIdle = 0;
                }
            }
        }
        if(shortest == -1){
            currentTime++;
            isIdle = 1;
            continue;
        }

        printf("Time %d: executing P%d (Remaining Time %d)\n", currentTime, proc[shortest].PID,
            proc[shortest].remainingTime);

        proc[shortest].remainingTime--;
        minRemaingTime = proc[shortest].remainingTime;
        if(proc[shortest].remainingTime == 0){
            proc[shortest].completionTime = currentTime;
            proc[shortest].turnaroundTime = proc[shortest].completionTime - proc[shortest].arrivalTime;
            proc[shortest].waitingTime = proc[shortest].turnaroundTime - proc[shortest].burstTime;

            printf("Time %d: P%d Completed\n", currentTime, proc[shortest].PID);
            completed++;
            minRemaingTime = INT_MAX;
            shortest = -1;
        }
        currentTime++;
    }

    printf("--------------------------------\n\n");
}

void printPrcess(struct Process proc[], int n){
    printf("P\tAT\tBT\tCT\tTAT\tWT\n");
    for(int i = 0; i < n; i++){
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n", proc[i].PID, proc[i].arrivalTime, proc[i].burstTime,
            proc[i].completionTime, proc[i].turnaroundTime, proc[i].waitingTime);
    }
}

void avgTime(struct Process proc[], int n){
    int avgWait = 0;
    int avgTAT = 0;
    for(int i = 0; i < n; i++){
        avgWait += proc[i].waitingTime;
        avgTAT += proc[i].turnaroundTime;
    }
    printf("Average Waiting Time : %.2f\n", (float)avgWait/n);
    printf("Average Turnaround Time : %.2f\n", (float)avgTAT/n);
}

void takeInput(struct Process proc[], int n){
    for(int i = 0; i < n; i++){
        proc[i].PID = i + 1;
        printf("Enter the arrival Time for Process %d : ", proc[i].PID);
        scanf("%d", &proc[i].arrivalTime);
        printf("Enter the burst Time for Process %d : ", proc[i].PID);
        scanf("%d", &proc[i].burstTime);
    }
}

int main(){
    int n;
    printf("Enter the number the of Process : ");
    scanf("%d", &n);
    struct Process proc[n];
    takeInput(proc, n);
    calculateTime(proc, n);
    printPrcess(proc, n);
    avgTime(proc, n);

    return 0;
}