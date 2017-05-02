import java.util.Arrays;

    /*
     * java常用的排序方式：冒泡排序，选择排序，快速排序。
     */
public class Day0502 {
	 private int[] array;
	 public Day0502(int[] array){
		 this.array=array;
	 }
	 /*
	  * 冒泡法排序
	  * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。  
	  * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
	  * 针对所有的元素重复以上的步骤，除了最后一个。 
	  * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
      */
     public void  mppx(){    
		 
		 for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;	
				}
			}
		 }
		 for (int k:array) {
			System.out.print(k+"  ");
		}
		 
		 System.out.println(); 
	 }
	 /*
	  * 选择排序：
      * 在未排序序列中找到最小元素，存放到排序序列的起始位置。  
      * 再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列末尾。  
      * 以此类推，直到所有元素均排序完毕。  
	  */
	 public void xzpx(){    //
		 for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[i]>array[j])
					{
						int temp = array[j];
						array[i]=array[j];
						array[j]=temp;		
	                }  
			}                                 
		}
		 for (int k:array) {
				System.out.print(k+"  ");
			}
		 System.out.println();
     }
     int[] kspx(int[] a,int l,int r){
		 		if (l<r) {
		 			int i=l,j=r;
		 			int temp=a[l];  //基准数
		 			while(i<j){
		 				while(i<j&&a[j]>temp){
		 					j--;          //从右向左扫描第一个小于基准的数
		 				}
		 				
		 					a[i++]=a[j];     // 把右边的数往左边移位
		 				
		 				
		 				while(i<j&&a[i]<temp){
		 					i++;               //从左向右扫描第一个大于基准的数
						}
		 				
		 					a[j--]=a[i];        // 把左边的数往右边移位
		 				
		 			}
		 			a[i]=temp;
		 			kspx(a, l, i-1);
		 			kspx(a, i+1, r);
		 		}
		 		return a;
        
		 	}
		public void getkspx(int[] aa){
			this.array=aa;
			for(int k:kspx(array, 0, array.length-1)){ 
			System.out.print(k+" ");  
			}
			
		}	 		
		 
		 
		 
		 

  public static void main(String[] args) {
	  int[] aa = {12,55,68,78,59,15,62,54,48,45,89,48,56,788,998,585,158,20,11,11};
	  Day0502 a = new Day0502(aa);
//	  a.mppx();
//	  a.xzpx();
	  a.getkspx(aa);
	  
}
}
