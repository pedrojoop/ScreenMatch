package calculo;

public class RecomendationFilter {
    private String recomendation;

    public void filter(Classifier classifier) {
        if (classifier.getClassifier() >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classifier.getClassifier() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Mal avaliado");
        }
    }
}
