package br.com.pedro.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedro.converters.NumberConverter;
import br.com.pedro.exceptions.UnsuportedMathOperationException;
import br.com.pedro.math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double  sum(@PathVariable(value = "numberOne")String numberOne,
					@PathVariable(value = "numberTwo")String numberTwo
			)throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.sum( NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double  sub(@PathVariable(value = "numberOne")String numberOne,
					@PathVariable(value = "numberTwo")String numberTwo
			)throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.subtraction( NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double  mult(@PathVariable(value = "numberOne")String numberOne,
					@PathVariable(value = "numberTwo")String numberTwo
			)throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.multiplication( NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double  div(@PathVariable(value = "numberOne")String numberOne,
			@PathVariable(value = "numberTwo")String numberTwo
			)throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.division( NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double  mean(@PathVariable(value = "numberOne")String numberOne,
					@PathVariable(value = "numberTwo")String numberTwo
			)throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.mean( NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/squareRoot/{number}",method = RequestMethod.GET)
	public Double  squareRoot(@PathVariable(value = "number")String number
			
			)throws Exception {
		
		if(!NumberConverter.isNumeric(number) ) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		return math.squareRoot( NumberConverter.convertToDouble(number));
	}


}
