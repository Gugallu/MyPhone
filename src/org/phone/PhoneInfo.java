package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Enter Phone Name");
	}
	public void phoneCam() {
		System.out.println("Enter Phone Cam");
	}
	public void phoneStorage() {
		System.out.println("Enter Phone Storage");
	}
	public static void main (String[] args) {
		PhoneInfo info= new PhoneInfo();
		info.phoneName();
		info.phoneCam();
		info.phoneStorage();
	}
}
