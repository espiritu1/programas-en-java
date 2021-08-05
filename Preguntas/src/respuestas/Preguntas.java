package respuestas;

public class Preguntas {
	private String correo;
	private Boolean asistirMuseo1;				//pregunta1
	private String tematicaMuseo2;				//pregunta2
	private Boolean visitdoMunal3;				//pregunta3
	private String formaVisitaMunal4;			//pregunta4
	private String interesHacerMuseo5;			//pregunta5
	private String comunicacionConElMuseo6;		//pregunta6
	//private String imagenes7;					//pregunta7
	private String criterioDeSeleccion8;		//pregunta8
	private String criteriodeseleccion9;		//pregunta9
	private String ordenarObra10;				//pregunta10
	private	String saberSobreObras11;			//pregunta11
	private	Boolean utilizadoAppParaPS12;		//pregunta12
	private	String nombreApp13;					//pregunta13
	private String tiempoUsoDeAPP14;			//pregunta14
	private Boolean utilizadoAppMuseo15;		//pregunta15
	private String incluirEnAPP16;				//pregunta16
	private String comentarioGeneral17;			//pregunta17

	//costrunctro por default
	public Preguntas() {
		
	}
	
	//costrunctor   responde no 
	public Preguntas(String correo ,Boolean asistirMuseo1,Boolean visitdoMunal3,
			String interesHacerMuseo5,String comunicacionConElMuseo6, String criterioDeSeleccion8,
			String criteriodeseleccion9,String ordenarObra10, String saberSobreObras11,
			Boolean utilizadoAppParaPS12, String tiempoUsoDeAPP14, Boolean utilizadoAppMuseo15,
			String incluirEnAPP16,String comentarioGeneral17) {
		
		this.correo=correo;
		this.asistirMuseo1=asistirMuseo1;
	    this.visitdoMunal3=visitdoMunal3;
	    this.interesHacerMuseo5=interesHacerMuseo5;
	    this.comunicacionConElMuseo6=comunicacionConElMuseo6; 
	    this.criterioDeSeleccion8=criterioDeSeleccion8;
	    this.criteriodeseleccion9=criteriodeseleccion9;
	    this.ordenarObra10=ordenarObra10;
	    this.saberSobreObras11=saberSobreObras11;
	    this.utilizadoAppParaPS12=utilizadoAppParaPS12;
	    this.tiempoUsoDeAPP14=tiempoUsoDeAPP14;
	    this.utilizadoAppMuseo15=utilizadoAppMuseo15;
	    this.incluirEnAPP16=incluirEnAPP16;
	    this.comentarioGeneral17=comentarioGeneral17;
	}
	
	//costrunctructor respode si

	public Preguntas(String correo, Boolean asistirMuseo1, String tematicaMuseo2, Boolean visitdoMunal3,
			String formaVisitaMunal4, String interesHacerMuseo5, String comunicacionConElMuseo6,
			String criterioDeSeleccion8, String criteriodeseleccion9, String ordenarObra10, String saberSobreObras11,
			Boolean utilizadoAppParaPS12, String nombreApp13, String tiempoUsoDeAPP14, Boolean utilizadoAppMuseo15,
			String incluirEnAPP16, String comentarioGeneral17) {
		super();
		this.correo = correo;
		this.asistirMuseo1 = asistirMuseo1;
		this.tematicaMuseo2 = tematicaMuseo2;
		this.visitdoMunal3 = visitdoMunal3;
		this.formaVisitaMunal4 = formaVisitaMunal4;
		this.interesHacerMuseo5 = interesHacerMuseo5;
		this.comunicacionConElMuseo6 = comunicacionConElMuseo6;
		this.criterioDeSeleccion8 = criterioDeSeleccion8;
		this.criteriodeseleccion9 = criteriodeseleccion9;
		this.ordenarObra10 = ordenarObra10;
		this.saberSobreObras11 = saberSobreObras11;
		this.utilizadoAppParaPS12 = utilizadoAppParaPS12;
		this.nombreApp13 = nombreApp13;
		this.tiempoUsoDeAPP14 = tiempoUsoDeAPP14;
		this.utilizadoAppMuseo15 = utilizadoAppMuseo15;
		this.incluirEnAPP16 = incluirEnAPP16;
		this.comentarioGeneral17 = comentarioGeneral17;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Boolean getAsistirMuseo1() {
		return asistirMuseo1;
	}

	public void setAsistirMuseo1(Boolean asistirMuseo1) {
		this.asistirMuseo1 = asistirMuseo1;
	}

	public String getTematicaMuseo2() {
		return tematicaMuseo2;
	}

	public void setTematicaMuseo2(String tematicaMuseo2) {
		this.tematicaMuseo2 = tematicaMuseo2;
	}

	public Boolean getVisitdoMunal3() {
		return visitdoMunal3;
	}

	public void setVisitdoMunal3(Boolean visitdoMunal3) {
		this.visitdoMunal3 = visitdoMunal3;
	}

	public String getFormaVisitaMunal4() {
		return formaVisitaMunal4;
	}

	public void setFormaVisitaMunal4(String formaVisitaMunal4) {
		this.formaVisitaMunal4 = formaVisitaMunal4;
	}

	public String getInteresHacerMuseo5() {
		return interesHacerMuseo5;
	}

	public void setInteresHacerMuseo5(String interesHacerMuseo5) {
		this.interesHacerMuseo5 = interesHacerMuseo5;
	}

	public String getComunicacionConElMuseo6() {
		return comunicacionConElMuseo6;
	}

	public void setComunicacionConElMuseo6(String comunicacionConElMuseo6) {
		this.comunicacionConElMuseo6 = comunicacionConElMuseo6;
	}

	public String getCriterioDeSeleccion8() {
		return criterioDeSeleccion8;
	}

	public void setCriterioDeSeleccion8(String criterioDeSeleccion8) {
		this.criterioDeSeleccion8 = criterioDeSeleccion8;
	}

	public String getCriteriodeseleccion9() {
		return criteriodeseleccion9;
	}

	public void setCriteriodeseleccion9(String criteriodeseleccion9) {
		this.criteriodeseleccion9 = criteriodeseleccion9;
	}

	public String getOrdenarObra10() {
		return ordenarObra10;
	}

	public void setOrdenarObra10(String ordenarObra10) {
		this.ordenarObra10 = ordenarObra10;
	}

	public String getSaberSobreObras11() {
		return saberSobreObras11;
	}

	public void setSaberSobreObras11(String saberSobreObras11) {
		this.saberSobreObras11 = saberSobreObras11;
	}

	public Boolean getUtilizadoAppParaPS12() {
		return utilizadoAppParaPS12;
	}

	public void setUtilizadoAppParaPS12(Boolean utilizadoAppParaPS12) {
		this.utilizadoAppParaPS12 = utilizadoAppParaPS12;
	}

	public String getNombreApp13() {
		return nombreApp13;
	}

	public void setNombreApp13(String nombreApp13) {
		this.nombreApp13 = nombreApp13;
	}

	public String getTiempoUsoDeAPP14() {
		return tiempoUsoDeAPP14;
	}

	public void setTiempoUsoDeAPP14(String tiempoUsoDeAPP14) {
		this.tiempoUsoDeAPP14 = tiempoUsoDeAPP14;
	}

	public Boolean getUtilizadoAppMuseo15() {
		return utilizadoAppMuseo15;
	}

	public void setUtilizadoAppMuseo15(Boolean utilizadoAppMuseo15) {
		this.utilizadoAppMuseo15 = utilizadoAppMuseo15;
	}

	public String getIncluirEnAPP16() {
		return incluirEnAPP16;
	}

	public void setIncluirEnAPP16(String incluirEnAPP16) {
		this.incluirEnAPP16 = incluirEnAPP16;
	}

	public String getComentarioGeneral17() {
		return comentarioGeneral17;
	}

	public void setComentarioGeneral17(String comentarioGeneral17) {
		this.comentarioGeneral17 = comentarioGeneral17;
	}
	
	
	
	
	

	

}
