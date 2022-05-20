package chap09;

public interface Fax {
	String Fax_NUMBER = "051-857-2160"; //상수선언
	void send(String tel);
	void receive(String tel);
}
