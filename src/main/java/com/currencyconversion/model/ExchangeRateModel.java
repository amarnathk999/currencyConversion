package com.currencyconversion.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


import lombok.Data;

@Data
public class ExchangeRateModel {
	private Long id;

	@NotBlank(message = "{exchangeRate.currencyCode.required}")
	private String currencyCode;

	@Positive(message = "{exchangeRate.rate.positive}")
	@NotNull(message = "{exchangeRate.rate.required}")
	private BigDecimal rate;

	public ExchangeRateModel(String currencyCode, BigDecimal rate) {
		this.currencyCode = currencyCode;
		this.rate = rate;
	}

	public ExchangeRateModel(Long id, String currencyCode, BigDecimal rate) {
		this.id = id;
		this.currencyCode = currencyCode;
		this.rate = rate;
	}


	//	@Override
	//	public int hashCode() {
	//		return Objects.hash(id, currencyCode, rate);
	//	}

	@Override
	public String toString() {
		return String.format("ExchangeRateModel [id=%s, currencyCode=%s, rate=%s, created=%s, lastUpdated=%s]", id,
				currencyCode, rate);
	}
}
