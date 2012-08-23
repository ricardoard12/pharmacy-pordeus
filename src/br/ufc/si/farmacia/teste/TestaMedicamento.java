package br.ufc.si.farmacia.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import br.ufc.si.farmacia.dao.MedicamentoDAO;
import br.ufc.si.farmacia.interfaces.IMedicamentoDAO;
import br.ufc.si.farmacia.model.Medicamento;

public class TestaMedicamento {

	public static void main(String[] args) throws ParseException {

		String dataEmTexto = "30-08-2012";
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dataEmTexto);

		Medicamento medicamento = new Medicamento(14, " the Best Medicamento",
				15, "comprimido", 30, 10, 300, "loteMedicamento", date,
				"notaFiscalMedicamento", "tipoAtencaoMedicamento",
				"tipoMedicamento", 12, false);

		IMedicamentoDAO imedic = new MedicamentoDAO();
		// imedic.InserirRemedio(medicamento);

		List<Medicamento> lista = new ArrayList<Medicamento>();
		lista = imedic.ListarMedicamentosQueVenceraoNoMes();

		for (Medicamento elem : lista) {
			System.out.println(elem.getTipoMedicamento() + "|"
					+ elem.getValorMedicamento() + "|"
					+ elem.getNomeMedicamento() + "|"
					+ elem.getValidadeMedicamento().toString() + "|"
					+ elem.getTotalUnidadesDisponiveis());
		}

		System.out.println("beleza");

	}

}// fim da classe
