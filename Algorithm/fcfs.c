#include<stdio.h>

void fcfs_algo(int n, int arr_time[], int burst_time[]){
    int turn_time[n], w_time[n], com_time[n];
    int avgWait = 0, avgTurnTime = 0;
    com_time[0] = arr_time[0] + burst_time[0];
    for(int i = 0; i < n; i++){
        if(com_time[i-1] > arr_time[i]){
            com_time[i] = com_time[i-1] + burst_time[i];
        }else{
            com_time[i] = arr_time[i] + burst_time[i];
        }
    }
    for(int i = 0; i < n; i++){
        turn_time[i] = com_time[i] - arr_time[i];
        w_time[i] = turn_time[i] - burst_time[i];
        avgTurnTime += turn_time[i];
        avgWait += w_time[i];
    }
    printf("P\tAT\tBT\tTAT\tCT\tWT\n");
    for(int i = 0; i < n; i++){
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",i+1,arr_time[i], burst_time[i], turn_time[i], com_time[i], w_time[i]);
    }
    printf("Average Wait time : %.2f\n", (float)avgWait/n);
    printf("Average Turnaround Time : %.2f\n",(float)avgTurnTime/n);
}

int main(){
    int n;
    printf("Enter number of processes : ");
    scanf("%d",&n);
    int arr_time[n], burst_time[n];
    for(int i = 0; i < n; i++){
        printf("Enter Arrival Time for Process %d : ",i+1);
        scanf("%d",&arr_time[i]);
        printf("Enter Burst Time of process %d : ",i + 1);
        scanf("%d",&burst_time[i]);
    }
    fcfs_algo(n,arr_time, burst_time);
    return 0;
}