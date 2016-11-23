package rmi.interfaces;

public interface CalculatorInterface extends java.rmi.Remote {
	
	int add(int x, int y) throws java.rmi.RemoteException;

}
