package s3;

public class StrategieC implements IStrategie {

	public void AppliquerStratégie(int[] t) {
		int i;
		int j;
		for (i=0;i<t.length;i++) {
			int min = i;
			for (j=i+1;j<t.length;j++) {
				if (t[min]>t[j]) {
					min = j;
				}
			}
			int temp = t[i];
			t[i] = t[min];
			t[min] = temp;
		}
	}
}
