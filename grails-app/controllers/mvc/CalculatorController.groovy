package mvc

class CalculatorModel {
    double en;
    double msp;
    double result;
}

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        calculatorModel.result = (calculatorModel.en + calculatorModel.msp) / 2
        render view: "CalculatorOutput", model: [model: calculatorModel]
    }
}
