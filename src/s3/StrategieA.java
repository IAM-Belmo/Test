package s3;

public class StrategieA implements IStrategie{

	public void AppliquerStratégie(int[] t) {
		int i;
		int j;
		for (i=0;i<t.length;i++) {
			for (j=i+1;j<t.length;j++) {
				if (t[i]>t[j]) {
					int temp = t[i];
					t[i] = t[j];
					t[j] = temp;	
				}
			}
		}
	}	
}
