package minusXL_data_management;

import javax.swing.JOptionPane;

public class MeanFunction extends StatisticFunction {

	public MeanFunction(SpreadSheet sheet, int r, int c, String value, String formula) {
		super(sheet, r, c, formula, formula);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object calculateValue(Object[] inputs) {
		if (!checkValidity(inputs)) {
			JOptionPane.showMessageDialog(null,"�� �������� ������� ��� ����� �����");
			setHadFunc(false);
			return "ERROR!";
		}
		double array[] = new double[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			array[i] = Double.parseDouble((String) inputs[i]);
		}
		double sum = 0;
	    for (int i = 0; i < array.length; i++) {
	        sum += array[i];
	    }
	    return sum / array.length;
	}

}