import java.util.Arrays;

    /*
     * java���õ�����ʽ��ð������ѡ�����򣬿�������
     */
public class Day0502 {
	 private int[] array;
	 public Day0502(int[] array){
		 this.array=array;
	 }
	 /*
	  * ð�ݷ�����
	  * �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������  
	  * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
	  * ������е�Ԫ���ظ����ϵĲ��裬�������һ���� 
	  * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
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
	  * ѡ������
      * ��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ�á�  
      * �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ�����������ĩβ��  
      * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�  
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
		 			int temp=a[l];  //��׼��
		 			while(i<j){
		 				while(i<j&&a[j]>temp){
		 					j--;          //��������ɨ���һ��С�ڻ�׼����
		 				}
		 				
		 					a[i++]=a[j];     // ���ұߵ����������λ
		 				
		 				
		 				while(i<j&&a[i]<temp){
		 					i++;               //��������ɨ���һ�����ڻ�׼����
						}
		 				
		 					a[j--]=a[i];        // ����ߵ������ұ���λ
		 				
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
