package mdav;

public class MDavExample {

	public static void main(String[] args) {
		System.out.println("Start");
		
		MdavClusteringAlgo mdav = new MdavClusteringAlgo();
		String file = "C:\\test\200k.csv";

		
		long start1 = System.currentTimeMillis();
		double[][] matrixData = FileHelper.loadCsvFile(file, true);
		long start2 = System.currentTimeMillis();
		System.out.println("Load file in " + (start2 - start1) + " ms") ;  
		
		// Matrix
		MdavData data = new MdavNumericData(matrixData, new int[] {1,2,3}, 1);
		mdav.computeClusters(data, 7);
		
		System.out.println("Clustered " + (System.currentTimeMillis() - start2) + " ms") ;
		  
		data.displayClustersByLine();

	}

}
