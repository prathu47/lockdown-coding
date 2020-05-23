//c program to generate first N triangular numbers(where n is read from the keyboard)//



#include <stdio.h> 
  
// Function to find triangular number 
void triangular_series(int n) 
{ 
    for (int i = 0; i <= n; i++)  
        printf(" %d ", i*(i+1)/2); 
} 
  
// Driven Function 
int main() 
{ 
    int n;
    printf("enter the n");
    scanf("%d",&n);
    triangular_series(n); 
    return 0; 
}
