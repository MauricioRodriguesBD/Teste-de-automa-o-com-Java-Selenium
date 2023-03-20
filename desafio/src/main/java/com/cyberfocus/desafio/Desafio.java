package com.cyberfocus.desafio;

public class Desafio {

	public static void main(String[] args) throws InterruptedException {

		Cadastro cadastro = new Cadastro();

		cadastro.preencherFormulario("Mauricio", "Rodrigues", "Rua abc, 123", "mauricio.rodriguesbd@gmail.com",
				"11999999999", "Male", "Cricket", "English", "Java", "Japan", "2000", "February", "15", "senha123");

		Frame frame = new Frame();
		frame.sendTextToFrame("Teste de exemplo");

		DatePicker datePicker = new DatePicker();
		datePicker.selecionarData("07/02/1997");
		datePicker.selecionarData2("07/02/1997");

		Slider slider = new Slider();
		slider.moverBarra("50%");

	}

}
