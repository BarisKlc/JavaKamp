package odevHafta3;

public class TeacherCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}
