package spring;

import org.springframework.beans.factory.FactoryBean;

public class CarFacatoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setType("BENZ");
		return car1;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}


}
