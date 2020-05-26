public class RemoveTens {

	public static void main(String[] args) {
		
				int Input[]={1,10,10,2};
				int toRemove=10;
				
				RemoveTens.toRemoveElement(Input, toRemove);
			}	
				
			private static void toRemoveElement(int[] Input,int toRemove)
			{
			 int[] ini=Input;
			int rem=toRemove;
			int count=0;	

			System.out.println("before removing");
			for(int i =0;i<ini.length;i++)
			{		
			System.out.println(ini[i] +" ");
			}
			for(int i =0;i<ini.length;i++)
			if(ini[i]==rem)
			{
				for(int j=i;j<ini.length;j++)
				{
					if(i!=ini.length-1)
					{
					ini[i]=ini[i+1];
					ini[i]=0;
					}
					else
					{
						ini[i]=0;
					}
				}
			}

			
			for (int i=0;i<ini.length;i++)
			{
				if(ini[i]!=0) { 
					ini[count++]=ini[i];
					
				}
				
			}
			while(count<ini.length) {
				ini[count++]=0;
			}
				
		System.out.println("after removing" +rem);
			
			for(int i=0;i<ini.length; i++)
			{
				System.out.println(ini[i] +" ");
			}
			}
		
	}
