package rmi.interfaces;

public interface CalculatorInterface extends java.rmi.Remote {
	
	Double add(Double x, Double y) throws java.rmi.RemoteException;
	
	Double subtract(Double x, Double y) throws java.rmi.RemoteException;
	
	Double multiply(Double x, Double y) throws java.rmi.RemoteException;
	
	Double divide(Double x, Double y) throws java.rmi.RemoteException;

}
