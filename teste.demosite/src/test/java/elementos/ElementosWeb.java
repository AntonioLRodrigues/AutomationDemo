package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By fistName = By.xpath("//input[@placeholder='First Name']");
	private By lastName = By.xpath("//input[@placeholder='Last Name']");
	private By Adress = By.xpath("//textarea[@rows='3']");
	private By emailAdress = By.xpath("//input[@type='email']");
	private By phone = By.xpath("//input[@type='tel']");
	private By gender = By.name("radiooptions");
	private By hobbies = By.id("checkbox2");
	private By language = By.id("msdd");
	private By BtnLanguage = By.xpath("//a[text()='English']");
	private By Skills = By.cssSelector("#Skills > option:nth-child(6)");
	private By SelectCountry = By.xpath("//span[@role='combobox']");
	private By BtnSelectorCountry = By.cssSelector("#select2-country-results > li:nth-child(2)");
	private By DateOfBirthYear = By.cssSelector("#yearbox > option:nth-child(86)");
	private By DateOfBirthMonth = By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select > option:nth-child(9)");
	private By DateOfBirthDDay = By.cssSelector("#daybox > option:nth-child(22)");
	private By Password = By.id("firstpassword");
	private By ConPassword = By.id("secondpassword");
	private By BtnSubmit = By.id("submitbtn");
	
	public By getBtnSubmit() {
		return BtnSubmit;
	}
	public By getPassword() {
		return Password;
	}
	public By getConPassword() {
		return ConPassword;
	}
	public By getBtnLanguage() {
		return BtnLanguage;
	}
	public By getBtnSelectorCountry() {
		return BtnSelectorCountry;
	}
	public By getDateOfBirthYear() {
		return DateOfBirthYear;
	}
	public By getDateOfBirthDDay() {
		return DateOfBirthDDay;
	}
	public By getDateOfBirthMonth() {
		return DateOfBirthMonth;
	}
	public By getSelectCountry() {
		return SelectCountry;
	}
	public By getSkills() {
		return Skills;
	}
	public By getGender() {
		return gender;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getLanguage() {
		return language;
	}
	public By getFistName() {
		return fistName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getAdress() {
		return Adress;
	}
	public By getEmailAdress() {
		return emailAdress;
	}
	public By getPhone() {
		return phone;
	}
}
