# include <stdio.h>
# include <string.h>
void main()
{
    int n,x=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    if (n <= 0) 
    {  
            printf("Enter a correct number.");  
     }
    while (n != 1) 
    {  
            if (n % 5 == 0) 
            {  
                n /= 5;  
            } 
            else if (n % 3 == 0) 
            {  
                n /= 3;  
            } 
            else if (n % 2 == 0) 
            {  
                n /= 2;  
            } 
            else 
            {  
                printf("It's not an ugly number.\n"); 
                x = 1;  
                break;  
            }  
    } 	        
    if (x==0)
    { 
        printf("It's an ugly number.\n");
    }
}
