


#include<stdio.h>

struct Process{
    int PID;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;
    int isCompleted;
};

void calculateTime(struct Process proc[], int n){
    int currentTime = 0;
    int completed = 0;
    while(completed < n){
        int minIndex = -1;
        for(int i = 0; i < n; i++){
            if(!proc[i].isCompleted && proc[i].arrivalTime <= currentTime){
                if(minIndex == -1 || proc[i].arrivalTime < proc[minIndex].burstTime){
                    minIndex = i;
                }
            }
        }
        if(minIndex == -1){
            currentTime++;
            continue;
        }
        currentTime += proc[minIndex].burstTime;
        proc[minIndex].completionTime = currentTime;
        proc[minIndex].turnaroundTime = proc[minIndex].completionTime - proc[minIndex].arrivalTime;
        proc[minIndex].waitingTime = proc[minIndex].turnaroundTime - proc[minIndex].burstTime;
        proc[minIndex].isCompleted = 1;
        completed++;
    }
}

void printProcess(struct Process proc[], int n){
    printf("P\tAT\tBT\tCT\tTAT\tWT\n");
    for(int i = 0; i < n; i++){
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",proc[i].PID, proc[i].arrivalTime, proc[i].burstTime,
            proc[i].completionTime, proc[i].turnaroundTime, proc[i].waitingTime);
    }
}

void calculateAvg(struct Process proc[], int n){
    int avgWait = 0;
    int avgTAT = 0;
    for(int i = 0; i < n; i++){
        avgWait += proc[i].waitingTime;
        avgTAT += proc[i].turnaroundTime;
    }
    printf("Average Waiting time : %.2f\n", (float)avgWait/n);
    printf("Average turnaround Time : %.2f\n", (float)avgTAT/n);
}

void takeInput(struct Process proc[], int n){
    for(int i = 0; i < n; i++){
        proc[i].PID = i + 1;
        printf("Enter Arrival Time of Process %d : ", proc[i].PID);
        scanf("%d", &proc[i].arrivalTime);
        printf("Enter Burst Time for Process %d : ", proc[i].PID);
        scanf("%d", &proc[i].burstTime);
        proc[i].isCompleted = 0;
        printf("Process %d completed\n",i);
    }
}

int main(){
    int n;
    printf("Enter number of Process : ");
    scanf("%d", &n);
    struct Process proc[n];
    takeInput(proc, n);
    calculateTime(proc, n);
    printProcess(proc, n);
    calculateAvg(proc, n);
    return 0;
}