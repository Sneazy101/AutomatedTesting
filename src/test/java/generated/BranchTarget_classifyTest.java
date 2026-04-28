import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BranchTarget_classifyTest {

    @Test
    public void test_classify() {
        BranchTarget obj = new BranchTarget();

        // Testing with values: [0.0, true, 0, 0, ]
        obj.classify(0.0f, true, 0, 0, "");
        // Testing with values: [0.0, true, 0, 0,  ]
        obj.classify(0.0f, true, 0, 0, " ");
        // Testing with values: [0.0, true, 0, 0, Bumblebee]
        obj.classify(0.0f, true, 0, 0, "Bumblebee");
        // Testing with values: [0.0, true, 0, 1, ]
        obj.classify(0.0f, true, 0, 1, "");
        // Testing with values: [0.0, true, 0, 1,  ]
        obj.classify(0.0f, true, 0, 1, " ");
        // Testing with values: [0.0, true, 0, 1, Bumblebee]
        obj.classify(0.0f, true, 0, 1, "Bumblebee");
        // Testing with values: [0.0, true, 0, -1, ]
        obj.classify(0.0f, true, 0, -1, "");
        // Testing with values: [0.0, true, 0, -1,  ]
        obj.classify(0.0f, true, 0, -1, " ");
        // Testing with values: [0.0, true, 0, -1, Bumblebee]
        obj.classify(0.0f, true, 0, -1, "Bumblebee");
        // Testing with values: [0.0, true, 0, 8, ]
        obj.classify(0.0f, true, 0, 8, "");
        // Testing with values: [0.0, true, 0, 8,  ]
        obj.classify(0.0f, true, 0, 8, " ");
        // Testing with values: [0.0, true, 0, 8, Bumblebee]
        obj.classify(0.0f, true, 0, 8, "Bumblebee");
        // Testing with values: [0.0, true, 0, 9, ]
        obj.classify(0.0f, true, 0, 9, "");
        // Testing with values: [0.0, true, 0, 9,  ]
        obj.classify(0.0f, true, 0, 9, " ");
        // Testing with values: [0.0, true, 0, 9, Bumblebee]
        obj.classify(0.0f, true, 0, 9, "Bumblebee");
        // Testing with values: [0.0, true, 0, 50, ]
        obj.classify(0.0f, true, 0, 50, "");
        // Testing with values: [0.0, true, 0, 50,  ]
        obj.classify(0.0f, true, 0, 50, " ");
        // Testing with values: [0.0, true, 0, 50, Bumblebee]
        obj.classify(0.0f, true, 0, 50, "Bumblebee");
        // Testing with values: [0.0, true, 0, -50, ]
        obj.classify(0.0f, true, 0, -50, "");
        // Testing with values: [0.0, true, 0, -50,  ]
        obj.classify(0.0f, true, 0, -50, " ");
        // Testing with values: [0.0, true, 0, -50, Bumblebee]
        obj.classify(0.0f, true, 0, -50, "Bumblebee");
        // Testing with values: [0.0, true, 0, 10, ]
        obj.classify(0.0f, true, 0, 10, "");
        // Testing with values: [0.0, true, 0, 10,  ]
        obj.classify(0.0f, true, 0, 10, " ");
        // Testing with values: [0.0, true, 0, 10, Bumblebee]
        obj.classify(0.0f, true, 0, 10, "Bumblebee");
        // Testing with values: [0.0, true, 1, 0, ]
        obj.classify(0.0f, true, 1, 0, "");
        // Testing with values: [0.0, true, 1, 0,  ]
        obj.classify(0.0f, true, 1, 0, " ");
        // Testing with values: [0.0, true, 1, 0, Bumblebee]
        obj.classify(0.0f, true, 1, 0, "Bumblebee");
        // Testing with values: [0.0, true, 1, 1, ]
        obj.classify(0.0f, true, 1, 1, "");
        // Testing with values: [0.0, true, 1, 1,  ]
        obj.classify(0.0f, true, 1, 1, " ");
        // Testing with values: [0.0, true, 1, 1, Bumblebee]
        obj.classify(0.0f, true, 1, 1, "Bumblebee");
        // Testing with values: [0.0, true, 1, -1, ]
        obj.classify(0.0f, true, 1, -1, "");
        // Testing with values: [0.0, true, 1, -1,  ]
        obj.classify(0.0f, true, 1, -1, " ");
        // Testing with values: [0.0, true, 1, -1, Bumblebee]
        obj.classify(0.0f, true, 1, -1, "Bumblebee");
        // Testing with values: [0.0, true, 1, 8, ]
        obj.classify(0.0f, true, 1, 8, "");
        // Testing with values: [0.0, true, 1, 8,  ]
        obj.classify(0.0f, true, 1, 8, " ");
        // Testing with values: [0.0, true, 1, 8, Bumblebee]
        obj.classify(0.0f, true, 1, 8, "Bumblebee");
        // Testing with values: [0.0, true, 1, 9, ]
        obj.classify(0.0f, true, 1, 9, "");
        // Testing with values: [0.0, true, 1, 9,  ]
        obj.classify(0.0f, true, 1, 9, " ");
        // Testing with values: [0.0, true, 1, 9, Bumblebee]
        obj.classify(0.0f, true, 1, 9, "Bumblebee");
        // Testing with values: [0.0, true, 1, 50, ]
        obj.classify(0.0f, true, 1, 50, "");
        // Testing with values: [0.0, true, 1, 50,  ]
        obj.classify(0.0f, true, 1, 50, " ");
        // Testing with values: [0.0, true, 1, 50, Bumblebee]
        obj.classify(0.0f, true, 1, 50, "Bumblebee");
        // Testing with values: [0.0, true, 1, -50, ]
        obj.classify(0.0f, true, 1, -50, "");
        // Testing with values: [0.0, true, 1, -50,  ]
        obj.classify(0.0f, true, 1, -50, " ");
        // Testing with values: [0.0, true, 1, -50, Bumblebee]
        obj.classify(0.0f, true, 1, -50, "Bumblebee");
        // Testing with values: [0.0, true, 1, 10, ]
        obj.classify(0.0f, true, 1, 10, "");
        // Testing with values: [0.0, true, 1, 10,  ]
        obj.classify(0.0f, true, 1, 10, " ");
        // Testing with values: [0.0, true, 1, 10, Bumblebee]
        obj.classify(0.0f, true, 1, 10, "Bumblebee");
        // Testing with values: [0.0, true, -1, 0, ]
        obj.classify(0.0f, true, -1, 0, "");
        // Testing with values: [0.0, true, -1, 0,  ]
        obj.classify(0.0f, true, -1, 0, " ");
        // Testing with values: [0.0, true, -1, 0, Bumblebee]
        obj.classify(0.0f, true, -1, 0, "Bumblebee");
        // Testing with values: [0.0, true, -1, 1, ]
        obj.classify(0.0f, true, -1, 1, "");
        // Testing with values: [0.0, true, -1, 1,  ]
        obj.classify(0.0f, true, -1, 1, " ");
        // Testing with values: [0.0, true, -1, 1, Bumblebee]
        obj.classify(0.0f, true, -1, 1, "Bumblebee");
        // Testing with values: [0.0, true, -1, -1, ]
        obj.classify(0.0f, true, -1, -1, "");
        // Testing with values: [0.0, true, -1, -1,  ]
        obj.classify(0.0f, true, -1, -1, " ");
        // Testing with values: [0.0, true, -1, -1, Bumblebee]
        obj.classify(0.0f, true, -1, -1, "Bumblebee");
        // Testing with values: [0.0, true, -1, 8, ]
        obj.classify(0.0f, true, -1, 8, "");
        // Testing with values: [0.0, true, -1, 8,  ]
        obj.classify(0.0f, true, -1, 8, " ");
        // Testing with values: [0.0, true, -1, 8, Bumblebee]
        obj.classify(0.0f, true, -1, 8, "Bumblebee");
        // Testing with values: [0.0, true, -1, 9, ]
        obj.classify(0.0f, true, -1, 9, "");
        // Testing with values: [0.0, true, -1, 9,  ]
        obj.classify(0.0f, true, -1, 9, " ");
        // Testing with values: [0.0, true, -1, 9, Bumblebee]
        obj.classify(0.0f, true, -1, 9, "Bumblebee");
        // Testing with values: [0.0, true, -1, 50, ]
        obj.classify(0.0f, true, -1, 50, "");
        // Testing with values: [0.0, true, -1, 50,  ]
        obj.classify(0.0f, true, -1, 50, " ");
        // Testing with values: [0.0, true, -1, 50, Bumblebee]
        obj.classify(0.0f, true, -1, 50, "Bumblebee");
        // Testing with values: [0.0, true, -1, -50, ]
        obj.classify(0.0f, true, -1, -50, "");
        // Testing with values: [0.0, true, -1, -50,  ]
        obj.classify(0.0f, true, -1, -50, " ");
        // Testing with values: [0.0, true, -1, -50, Bumblebee]
        obj.classify(0.0f, true, -1, -50, "Bumblebee");
        // Testing with values: [0.0, true, -1, 10, ]
        obj.classify(0.0f, true, -1, 10, "");
        // Testing with values: [0.0, true, -1, 10,  ]
        obj.classify(0.0f, true, -1, 10, " ");
        // Testing with values: [0.0, true, -1, 10, Bumblebee]
        obj.classify(0.0f, true, -1, 10, "Bumblebee");
        // Testing with values: [0.0, true, 2, 0, ]
        obj.classify(0.0f, true, 2, 0, "");
        // Testing with values: [0.0, true, 2, 0,  ]
        obj.classify(0.0f, true, 2, 0, " ");
        // Testing with values: [0.0, true, 2, 0, Bumblebee]
        obj.classify(0.0f, true, 2, 0, "Bumblebee");
        // Testing with values: [0.0, true, 2, 1, ]
        obj.classify(0.0f, true, 2, 1, "");
        // Testing with values: [0.0, true, 2, 1,  ]
        obj.classify(0.0f, true, 2, 1, " ");
        // Testing with values: [0.0, true, 2, 1, Bumblebee]
        obj.classify(0.0f, true, 2, 1, "Bumblebee");
        // Testing with values: [0.0, true, 2, -1, ]
        obj.classify(0.0f, true, 2, -1, "");
        // Testing with values: [0.0, true, 2, -1,  ]
        obj.classify(0.0f, true, 2, -1, " ");
        // Testing with values: [0.0, true, 2, -1, Bumblebee]
        obj.classify(0.0f, true, 2, -1, "Bumblebee");
        // Testing with values: [0.0, true, 2, 8, ]
        obj.classify(0.0f, true, 2, 8, "");
        // Testing with values: [0.0, true, 2, 8,  ]
        obj.classify(0.0f, true, 2, 8, " ");
        // Testing with values: [0.0, true, 2, 8, Bumblebee]
        obj.classify(0.0f, true, 2, 8, "Bumblebee");
        // Testing with values: [0.0, true, 2, 9, ]
        obj.classify(0.0f, true, 2, 9, "");
        // Testing with values: [0.0, true, 2, 9,  ]
        obj.classify(0.0f, true, 2, 9, " ");
        // Testing with values: [0.0, true, 2, 9, Bumblebee]
        obj.classify(0.0f, true, 2, 9, "Bumblebee");
        // Testing with values: [0.0, true, 2, 50, ]
        obj.classify(0.0f, true, 2, 50, "");
        // Testing with values: [0.0, true, 2, 50,  ]
        obj.classify(0.0f, true, 2, 50, " ");
        // Testing with values: [0.0, true, 2, 50, Bumblebee]
        obj.classify(0.0f, true, 2, 50, "Bumblebee");
        // Testing with values: [0.0, true, 2, -50, ]
        obj.classify(0.0f, true, 2, -50, "");
        // Testing with values: [0.0, true, 2, -50,  ]
        obj.classify(0.0f, true, 2, -50, " ");
        // Testing with values: [0.0, true, 2, -50, Bumblebee]
        obj.classify(0.0f, true, 2, -50, "Bumblebee");
        // Testing with values: [0.0, true, 2, 10, ]
        obj.classify(0.0f, true, 2, 10, "");
        // Testing with values: [0.0, true, 2, 10,  ]
        obj.classify(0.0f, true, 2, 10, " ");
        // Testing with values: [0.0, true, 2, 10, Bumblebee]
        obj.classify(0.0f, true, 2, 10, "Bumblebee");
        // Testing with values: [0.0, true, 3, 0, ]
        obj.classify(0.0f, true, 3, 0, "");
        // Testing with values: [0.0, true, 3, 0,  ]
        obj.classify(0.0f, true, 3, 0, " ");
        // Testing with values: [0.0, true, 3, 0, Bumblebee]
        obj.classify(0.0f, true, 3, 0, "Bumblebee");
        // Testing with values: [0.0, true, 3, 1, ]
        obj.classify(0.0f, true, 3, 1, "");
        // Testing with values: [0.0, true, 3, 1,  ]
        obj.classify(0.0f, true, 3, 1, " ");
        // Testing with values: [0.0, true, 3, 1, Bumblebee]
        obj.classify(0.0f, true, 3, 1, "Bumblebee");
        // Testing with values: [0.0, true, 3, -1, ]
        obj.classify(0.0f, true, 3, -1, "");
        // Testing with values: [0.0, true, 3, -1,  ]
        obj.classify(0.0f, true, 3, -1, " ");
        // Testing with values: [0.0, true, 3, -1, Bumblebee]
        obj.classify(0.0f, true, 3, -1, "Bumblebee");
        // Testing with values: [0.0, true, 3, 8, ]
        obj.classify(0.0f, true, 3, 8, "");
        // Testing with values: [0.0, true, 3, 8,  ]
        obj.classify(0.0f, true, 3, 8, " ");
        // Testing with values: [0.0, true, 3, 8, Bumblebee]
        obj.classify(0.0f, true, 3, 8, "Bumblebee");
        // Testing with values: [0.0, true, 3, 9, ]
        obj.classify(0.0f, true, 3, 9, "");
        // Testing with values: [0.0, true, 3, 9,  ]
        obj.classify(0.0f, true, 3, 9, " ");
        // Testing with values: [0.0, true, 3, 9, Bumblebee]
        obj.classify(0.0f, true, 3, 9, "Bumblebee");
        // Testing with values: [0.0, true, 3, 50, ]
        obj.classify(0.0f, true, 3, 50, "");
        // Testing with values: [0.0, true, 3, 50,  ]
        obj.classify(0.0f, true, 3, 50, " ");
        // Testing with values: [0.0, true, 3, 50, Bumblebee]
        obj.classify(0.0f, true, 3, 50, "Bumblebee");
        // Testing with values: [0.0, true, 3, -50, ]
        obj.classify(0.0f, true, 3, -50, "");
        // Testing with values: [0.0, true, 3, -50,  ]
        obj.classify(0.0f, true, 3, -50, " ");
        // Testing with values: [0.0, true, 3, -50, Bumblebee]
        obj.classify(0.0f, true, 3, -50, "Bumblebee");
        // Testing with values: [0.0, true, 3, 10, ]
        obj.classify(0.0f, true, 3, 10, "");
        // Testing with values: [0.0, true, 3, 10,  ]
        obj.classify(0.0f, true, 3, 10, " ");
        // Testing with values: [0.0, true, 3, 10, Bumblebee]
        obj.classify(0.0f, true, 3, 10, "Bumblebee");
        // Testing with values: [0.0, false, 0, 0, ]
        obj.classify(0.0f, false, 0, 0, "");
        // Testing with values: [0.0, false, 0, 0,  ]
        obj.classify(0.0f, false, 0, 0, " ");
        // Testing with values: [0.0, false, 0, 0, Bumblebee]
        obj.classify(0.0f, false, 0, 0, "Bumblebee");
        // Testing with values: [0.0, false, 0, 1, ]
        obj.classify(0.0f, false, 0, 1, "");
        // Testing with values: [0.0, false, 0, 1,  ]
        obj.classify(0.0f, false, 0, 1, " ");
        // Testing with values: [0.0, false, 0, 1, Bumblebee]
        obj.classify(0.0f, false, 0, 1, "Bumblebee");
        // Testing with values: [0.0, false, 0, -1, ]
        obj.classify(0.0f, false, 0, -1, "");
        // Testing with values: [0.0, false, 0, -1,  ]
        obj.classify(0.0f, false, 0, -1, " ");
        // Testing with values: [0.0, false, 0, -1, Bumblebee]
        obj.classify(0.0f, false, 0, -1, "Bumblebee");
        // Testing with values: [0.0, false, 0, 8, ]
        obj.classify(0.0f, false, 0, 8, "");
        // Testing with values: [0.0, false, 0, 8,  ]
        obj.classify(0.0f, false, 0, 8, " ");
        // Testing with values: [0.0, false, 0, 8, Bumblebee]
        obj.classify(0.0f, false, 0, 8, "Bumblebee");
        // Testing with values: [0.0, false, 0, 9, ]
        obj.classify(0.0f, false, 0, 9, "");
        // Testing with values: [0.0, false, 0, 9,  ]
        obj.classify(0.0f, false, 0, 9, " ");
        // Testing with values: [0.0, false, 0, 9, Bumblebee]
        obj.classify(0.0f, false, 0, 9, "Bumblebee");
        // Testing with values: [0.0, false, 0, 50, ]
        obj.classify(0.0f, false, 0, 50, "");
        // Testing with values: [0.0, false, 0, 50,  ]
        obj.classify(0.0f, false, 0, 50, " ");
        // Testing with values: [0.0, false, 0, 50, Bumblebee]
        obj.classify(0.0f, false, 0, 50, "Bumblebee");
        // Testing with values: [0.0, false, 0, -50, ]
        obj.classify(0.0f, false, 0, -50, "");
        // Testing with values: [0.0, false, 0, -50,  ]
        obj.classify(0.0f, false, 0, -50, " ");
        // Testing with values: [0.0, false, 0, -50, Bumblebee]
        obj.classify(0.0f, false, 0, -50, "Bumblebee");
        // Testing with values: [0.0, false, 0, 10, ]
        obj.classify(0.0f, false, 0, 10, "");
        // Testing with values: [0.0, false, 0, 10,  ]
        obj.classify(0.0f, false, 0, 10, " ");
        // Testing with values: [0.0, false, 0, 10, Bumblebee]
        obj.classify(0.0f, false, 0, 10, "Bumblebee");
        // Testing with values: [0.0, false, 1, 0, ]
        obj.classify(0.0f, false, 1, 0, "");
        // Testing with values: [0.0, false, 1, 0,  ]
        obj.classify(0.0f, false, 1, 0, " ");
        // Testing with values: [0.0, false, 1, 0, Bumblebee]
        obj.classify(0.0f, false, 1, 0, "Bumblebee");
        // Testing with values: [0.0, false, 1, 1, ]
        obj.classify(0.0f, false, 1, 1, "");
        // Testing with values: [0.0, false, 1, 1,  ]
        obj.classify(0.0f, false, 1, 1, " ");
        // Testing with values: [0.0, false, 1, 1, Bumblebee]
        obj.classify(0.0f, false, 1, 1, "Bumblebee");
        // Testing with values: [0.0, false, 1, -1, ]
        obj.classify(0.0f, false, 1, -1, "");
        // Testing with values: [0.0, false, 1, -1,  ]
        obj.classify(0.0f, false, 1, -1, " ");
        // Testing with values: [0.0, false, 1, -1, Bumblebee]
        obj.classify(0.0f, false, 1, -1, "Bumblebee");
        // Testing with values: [0.0, false, 1, 8, ]
        obj.classify(0.0f, false, 1, 8, "");
        // Testing with values: [0.0, false, 1, 8,  ]
        obj.classify(0.0f, false, 1, 8, " ");
        // Testing with values: [0.0, false, 1, 8, Bumblebee]
        obj.classify(0.0f, false, 1, 8, "Bumblebee");
        // Testing with values: [0.0, false, 1, 9, ]
        obj.classify(0.0f, false, 1, 9, "");
        // Testing with values: [0.0, false, 1, 9,  ]
        obj.classify(0.0f, false, 1, 9, " ");
        // Testing with values: [0.0, false, 1, 9, Bumblebee]
        obj.classify(0.0f, false, 1, 9, "Bumblebee");
        // Testing with values: [0.0, false, 1, 50, ]
        obj.classify(0.0f, false, 1, 50, "");
        // Testing with values: [0.0, false, 1, 50,  ]
        obj.classify(0.0f, false, 1, 50, " ");
        // Testing with values: [0.0, false, 1, 50, Bumblebee]
        obj.classify(0.0f, false, 1, 50, "Bumblebee");
        // Testing with values: [0.0, false, 1, -50, ]
        obj.classify(0.0f, false, 1, -50, "");
        // Testing with values: [0.0, false, 1, -50,  ]
        obj.classify(0.0f, false, 1, -50, " ");
        // Testing with values: [0.0, false, 1, -50, Bumblebee]
        obj.classify(0.0f, false, 1, -50, "Bumblebee");
        // Testing with values: [0.0, false, 1, 10, ]
        obj.classify(0.0f, false, 1, 10, "");
        // Testing with values: [0.0, false, 1, 10,  ]
        obj.classify(0.0f, false, 1, 10, " ");
        // Testing with values: [0.0, false, 1, 10, Bumblebee]
        obj.classify(0.0f, false, 1, 10, "Bumblebee");
        // Testing with values: [0.0, false, -1, 0, ]
        obj.classify(0.0f, false, -1, 0, "");
        // Testing with values: [0.0, false, -1, 0,  ]
        obj.classify(0.0f, false, -1, 0, " ");
        // Testing with values: [0.0, false, -1, 0, Bumblebee]
        obj.classify(0.0f, false, -1, 0, "Bumblebee");
        // Testing with values: [0.0, false, -1, 1, ]
        obj.classify(0.0f, false, -1, 1, "");
        // Testing with values: [0.0, false, -1, 1,  ]
        obj.classify(0.0f, false, -1, 1, " ");
        // Testing with values: [0.0, false, -1, 1, Bumblebee]
        obj.classify(0.0f, false, -1, 1, "Bumblebee");
        // Testing with values: [0.0, false, -1, -1, ]
        obj.classify(0.0f, false, -1, -1, "");
        // Testing with values: [0.0, false, -1, -1,  ]
        obj.classify(0.0f, false, -1, -1, " ");
        // Testing with values: [0.0, false, -1, -1, Bumblebee]
        obj.classify(0.0f, false, -1, -1, "Bumblebee");
        // Testing with values: [0.0, false, -1, 8, ]
        obj.classify(0.0f, false, -1, 8, "");
        // Testing with values: [0.0, false, -1, 8,  ]
        obj.classify(0.0f, false, -1, 8, " ");
        // Testing with values: [0.0, false, -1, 8, Bumblebee]
        obj.classify(0.0f, false, -1, 8, "Bumblebee");
        // Testing with values: [0.0, false, -1, 9, ]
        obj.classify(0.0f, false, -1, 9, "");
        // Testing with values: [0.0, false, -1, 9,  ]
        obj.classify(0.0f, false, -1, 9, " ");
        // Testing with values: [0.0, false, -1, 9, Bumblebee]
        obj.classify(0.0f, false, -1, 9, "Bumblebee");
        // Testing with values: [0.0, false, -1, 50, ]
        obj.classify(0.0f, false, -1, 50, "");
        // Testing with values: [0.0, false, -1, 50,  ]
        obj.classify(0.0f, false, -1, 50, " ");
        // Testing with values: [0.0, false, -1, 50, Bumblebee]
        obj.classify(0.0f, false, -1, 50, "Bumblebee");
        // Testing with values: [0.0, false, -1, -50, ]
        obj.classify(0.0f, false, -1, -50, "");
        // Testing with values: [0.0, false, -1, -50,  ]
        obj.classify(0.0f, false, -1, -50, " ");
        // Testing with values: [0.0, false, -1, -50, Bumblebee]
        obj.classify(0.0f, false, -1, -50, "Bumblebee");
        // Testing with values: [0.0, false, -1, 10, ]
        obj.classify(0.0f, false, -1, 10, "");
        // Testing with values: [0.0, false, -1, 10,  ]
        obj.classify(0.0f, false, -1, 10, " ");
        // Testing with values: [0.0, false, -1, 10, Bumblebee]
        obj.classify(0.0f, false, -1, 10, "Bumblebee");
        // Testing with values: [0.0, false, 2, 0, ]
        obj.classify(0.0f, false, 2, 0, "");
        // Testing with values: [0.0, false, 2, 0,  ]
        obj.classify(0.0f, false, 2, 0, " ");
        // Testing with values: [0.0, false, 2, 0, Bumblebee]
        obj.classify(0.0f, false, 2, 0, "Bumblebee");
        // Testing with values: [0.0, false, 2, 1, ]
        obj.classify(0.0f, false, 2, 1, "");
        // Testing with values: [0.0, false, 2, 1,  ]
        obj.classify(0.0f, false, 2, 1, " ");
        // Testing with values: [0.0, false, 2, 1, Bumblebee]
        obj.classify(0.0f, false, 2, 1, "Bumblebee");
        // Testing with values: [0.0, false, 2, -1, ]
        obj.classify(0.0f, false, 2, -1, "");
        // Testing with values: [0.0, false, 2, -1,  ]
        obj.classify(0.0f, false, 2, -1, " ");
        // Testing with values: [0.0, false, 2, -1, Bumblebee]
        obj.classify(0.0f, false, 2, -1, "Bumblebee");
        // Testing with values: [0.0, false, 2, 8, ]
        obj.classify(0.0f, false, 2, 8, "");
        // Testing with values: [0.0, false, 2, 8,  ]
        obj.classify(0.0f, false, 2, 8, " ");
        // Testing with values: [0.0, false, 2, 8, Bumblebee]
        obj.classify(0.0f, false, 2, 8, "Bumblebee");
        // Testing with values: [0.0, false, 2, 9, ]
        obj.classify(0.0f, false, 2, 9, "");
        // Testing with values: [0.0, false, 2, 9,  ]
        obj.classify(0.0f, false, 2, 9, " ");
        // Testing with values: [0.0, false, 2, 9, Bumblebee]
        obj.classify(0.0f, false, 2, 9, "Bumblebee");
        // Testing with values: [0.0, false, 2, 50, ]
        obj.classify(0.0f, false, 2, 50, "");
        // Testing with values: [0.0, false, 2, 50,  ]
        obj.classify(0.0f, false, 2, 50, " ");
        // Testing with values: [0.0, false, 2, 50, Bumblebee]
        obj.classify(0.0f, false, 2, 50, "Bumblebee");
        // Testing with values: [0.0, false, 2, -50, ]
        obj.classify(0.0f, false, 2, -50, "");
        // Testing with values: [0.0, false, 2, -50,  ]
        obj.classify(0.0f, false, 2, -50, " ");
        // Testing with values: [0.0, false, 2, -50, Bumblebee]
        obj.classify(0.0f, false, 2, -50, "Bumblebee");
        // Testing with values: [0.0, false, 2, 10, ]
        obj.classify(0.0f, false, 2, 10, "");
        // Testing with values: [0.0, false, 2, 10,  ]
        obj.classify(0.0f, false, 2, 10, " ");
        // Testing with values: [0.0, false, 2, 10, Bumblebee]
        obj.classify(0.0f, false, 2, 10, "Bumblebee");
        // Testing with values: [0.0, false, 3, 0, ]
        obj.classify(0.0f, false, 3, 0, "");
        // Testing with values: [0.0, false, 3, 0,  ]
        obj.classify(0.0f, false, 3, 0, " ");
        // Testing with values: [0.0, false, 3, 0, Bumblebee]
        obj.classify(0.0f, false, 3, 0, "Bumblebee");
        // Testing with values: [0.0, false, 3, 1, ]
        obj.classify(0.0f, false, 3, 1, "");
        // Testing with values: [0.0, false, 3, 1,  ]
        obj.classify(0.0f, false, 3, 1, " ");
        // Testing with values: [0.0, false, 3, 1, Bumblebee]
        obj.classify(0.0f, false, 3, 1, "Bumblebee");
        // Testing with values: [0.0, false, 3, -1, ]
        obj.classify(0.0f, false, 3, -1, "");
        // Testing with values: [0.0, false, 3, -1,  ]
        obj.classify(0.0f, false, 3, -1, " ");
        // Testing with values: [0.0, false, 3, -1, Bumblebee]
        obj.classify(0.0f, false, 3, -1, "Bumblebee");
        // Testing with values: [0.0, false, 3, 8, ]
        obj.classify(0.0f, false, 3, 8, "");
        // Testing with values: [0.0, false, 3, 8,  ]
        obj.classify(0.0f, false, 3, 8, " ");
        // Testing with values: [0.0, false, 3, 8, Bumblebee]
        obj.classify(0.0f, false, 3, 8, "Bumblebee");
        // Testing with values: [0.0, false, 3, 9, ]
        obj.classify(0.0f, false, 3, 9, "");
        // Testing with values: [0.0, false, 3, 9,  ]
        obj.classify(0.0f, false, 3, 9, " ");
        // Testing with values: [0.0, false, 3, 9, Bumblebee]
        obj.classify(0.0f, false, 3, 9, "Bumblebee");
        // Testing with values: [0.0, false, 3, 50, ]
        obj.classify(0.0f, false, 3, 50, "");
        // Testing with values: [0.0, false, 3, 50,  ]
        obj.classify(0.0f, false, 3, 50, " ");
        // Testing with values: [0.0, false, 3, 50, Bumblebee]
        obj.classify(0.0f, false, 3, 50, "Bumblebee");
        // Testing with values: [0.0, false, 3, -50, ]
        obj.classify(0.0f, false, 3, -50, "");
        // Testing with values: [0.0, false, 3, -50,  ]
        obj.classify(0.0f, false, 3, -50, " ");
        // Testing with values: [0.0, false, 3, -50, Bumblebee]
        obj.classify(0.0f, false, 3, -50, "Bumblebee");
        // Testing with values: [0.0, false, 3, 10, ]
        obj.classify(0.0f, false, 3, 10, "");
        // Testing with values: [0.0, false, 3, 10,  ]
        obj.classify(0.0f, false, 3, 10, " ");
        // Testing with values: [0.0, false, 3, 10, Bumblebee]
        obj.classify(0.0f, false, 3, 10, "Bumblebee");
        // Testing with values: [1.0, true, 0, 0, ]
        obj.classify(1.0f, true, 0, 0, "");
        // Testing with values: [1.0, true, 0, 0,  ]
        obj.classify(1.0f, true, 0, 0, " ");
        // Testing with values: [1.0, true, 0, 0, Bumblebee]
        obj.classify(1.0f, true, 0, 0, "Bumblebee");
        // Testing with values: [1.0, true, 0, 1, ]
        obj.classify(1.0f, true, 0, 1, "");
        // Testing with values: [1.0, true, 0, 1,  ]
        obj.classify(1.0f, true, 0, 1, " ");
        // Testing with values: [1.0, true, 0, 1, Bumblebee]
        obj.classify(1.0f, true, 0, 1, "Bumblebee");
        // Testing with values: [1.0, true, 0, -1, ]
        obj.classify(1.0f, true, 0, -1, "");
        // Testing with values: [1.0, true, 0, -1,  ]
        obj.classify(1.0f, true, 0, -1, " ");
        // Testing with values: [1.0, true, 0, -1, Bumblebee]
        obj.classify(1.0f, true, 0, -1, "Bumblebee");
        // Testing with values: [1.0, true, 0, 8, ]
        obj.classify(1.0f, true, 0, 8, "");
        // Testing with values: [1.0, true, 0, 8,  ]
        obj.classify(1.0f, true, 0, 8, " ");
        // Testing with values: [1.0, true, 0, 8, Bumblebee]
        obj.classify(1.0f, true, 0, 8, "Bumblebee");
        // Testing with values: [1.0, true, 0, 9, ]
        obj.classify(1.0f, true, 0, 9, "");
        // Testing with values: [1.0, true, 0, 9,  ]
        obj.classify(1.0f, true, 0, 9, " ");
        // Testing with values: [1.0, true, 0, 9, Bumblebee]
        obj.classify(1.0f, true, 0, 9, "Bumblebee");
        // Testing with values: [1.0, true, 0, 50, ]
        obj.classify(1.0f, true, 0, 50, "");
        // Testing with values: [1.0, true, 0, 50,  ]
        obj.classify(1.0f, true, 0, 50, " ");
        // Testing with values: [1.0, true, 0, 50, Bumblebee]
        obj.classify(1.0f, true, 0, 50, "Bumblebee");
        // Testing with values: [1.0, true, 0, -50, ]
        obj.classify(1.0f, true, 0, -50, "");
        // Testing with values: [1.0, true, 0, -50,  ]
        obj.classify(1.0f, true, 0, -50, " ");
        // Testing with values: [1.0, true, 0, -50, Bumblebee]
        obj.classify(1.0f, true, 0, -50, "Bumblebee");
        // Testing with values: [1.0, true, 0, 10, ]
        obj.classify(1.0f, true, 0, 10, "");
        // Testing with values: [1.0, true, 0, 10,  ]
        obj.classify(1.0f, true, 0, 10, " ");
        // Testing with values: [1.0, true, 0, 10, Bumblebee]
        obj.classify(1.0f, true, 0, 10, "Bumblebee");
        // Testing with values: [1.0, true, 1, 0, ]
        obj.classify(1.0f, true, 1, 0, "");
        // Testing with values: [1.0, true, 1, 0,  ]
        obj.classify(1.0f, true, 1, 0, " ");
        // Testing with values: [1.0, true, 1, 0, Bumblebee]
        obj.classify(1.0f, true, 1, 0, "Bumblebee");
        // Testing with values: [1.0, true, 1, 1, ]
        obj.classify(1.0f, true, 1, 1, "");
        // Testing with values: [1.0, true, 1, 1,  ]
        obj.classify(1.0f, true, 1, 1, " ");
        // Testing with values: [1.0, true, 1, 1, Bumblebee]
        obj.classify(1.0f, true, 1, 1, "Bumblebee");
        // Testing with values: [1.0, true, 1, -1, ]
        obj.classify(1.0f, true, 1, -1, "");
        // Testing with values: [1.0, true, 1, -1,  ]
        obj.classify(1.0f, true, 1, -1, " ");
        // Testing with values: [1.0, true, 1, -1, Bumblebee]
        obj.classify(1.0f, true, 1, -1, "Bumblebee");
        // Testing with values: [1.0, true, 1, 8, ]
        obj.classify(1.0f, true, 1, 8, "");
        // Testing with values: [1.0, true, 1, 8,  ]
        obj.classify(1.0f, true, 1, 8, " ");
        // Testing with values: [1.0, true, 1, 8, Bumblebee]
        obj.classify(1.0f, true, 1, 8, "Bumblebee");
        // Testing with values: [1.0, true, 1, 9, ]
        obj.classify(1.0f, true, 1, 9, "");
        // Testing with values: [1.0, true, 1, 9,  ]
        obj.classify(1.0f, true, 1, 9, " ");
        // Testing with values: [1.0, true, 1, 9, Bumblebee]
        obj.classify(1.0f, true, 1, 9, "Bumblebee");
        // Testing with values: [1.0, true, 1, 50, ]
        obj.classify(1.0f, true, 1, 50, "");
        // Testing with values: [1.0, true, 1, 50,  ]
        obj.classify(1.0f, true, 1, 50, " ");
        // Testing with values: [1.0, true, 1, 50, Bumblebee]
        obj.classify(1.0f, true, 1, 50, "Bumblebee");
        // Testing with values: [1.0, true, 1, -50, ]
        obj.classify(1.0f, true, 1, -50, "");
        // Testing with values: [1.0, true, 1, -50,  ]
        obj.classify(1.0f, true, 1, -50, " ");
        // Testing with values: [1.0, true, 1, -50, Bumblebee]
        obj.classify(1.0f, true, 1, -50, "Bumblebee");
        // Testing with values: [1.0, true, 1, 10, ]
        obj.classify(1.0f, true, 1, 10, "");
        // Testing with values: [1.0, true, 1, 10,  ]
        obj.classify(1.0f, true, 1, 10, " ");
        // Testing with values: [1.0, true, 1, 10, Bumblebee]
        obj.classify(1.0f, true, 1, 10, "Bumblebee");
        // Testing with values: [1.0, true, -1, 0, ]
        obj.classify(1.0f, true, -1, 0, "");
        // Testing with values: [1.0, true, -1, 0,  ]
        obj.classify(1.0f, true, -1, 0, " ");
        // Testing with values: [1.0, true, -1, 0, Bumblebee]
        obj.classify(1.0f, true, -1, 0, "Bumblebee");
        // Testing with values: [1.0, true, -1, 1, ]
        obj.classify(1.0f, true, -1, 1, "");
        // Testing with values: [1.0, true, -1, 1,  ]
        obj.classify(1.0f, true, -1, 1, " ");
        // Testing with values: [1.0, true, -1, 1, Bumblebee]
        obj.classify(1.0f, true, -1, 1, "Bumblebee");
        // Testing with values: [1.0, true, -1, -1, ]
        obj.classify(1.0f, true, -1, -1, "");
        // Testing with values: [1.0, true, -1, -1,  ]
        obj.classify(1.0f, true, -1, -1, " ");
        // Testing with values: [1.0, true, -1, -1, Bumblebee]
        obj.classify(1.0f, true, -1, -1, "Bumblebee");
        // Testing with values: [1.0, true, -1, 8, ]
        obj.classify(1.0f, true, -1, 8, "");
        // Testing with values: [1.0, true, -1, 8,  ]
        obj.classify(1.0f, true, -1, 8, " ");
        // Testing with values: [1.0, true, -1, 8, Bumblebee]
        obj.classify(1.0f, true, -1, 8, "Bumblebee");
        // Testing with values: [1.0, true, -1, 9, ]
        obj.classify(1.0f, true, -1, 9, "");
        // Testing with values: [1.0, true, -1, 9,  ]
        obj.classify(1.0f, true, -1, 9, " ");
        // Testing with values: [1.0, true, -1, 9, Bumblebee]
        obj.classify(1.0f, true, -1, 9, "Bumblebee");
        // Testing with values: [1.0, true, -1, 50, ]
        obj.classify(1.0f, true, -1, 50, "");
        // Testing with values: [1.0, true, -1, 50,  ]
        obj.classify(1.0f, true, -1, 50, " ");
        // Testing with values: [1.0, true, -1, 50, Bumblebee]
        obj.classify(1.0f, true, -1, 50, "Bumblebee");
        // Testing with values: [1.0, true, -1, -50, ]
        obj.classify(1.0f, true, -1, -50, "");
        // Testing with values: [1.0, true, -1, -50,  ]
        obj.classify(1.0f, true, -1, -50, " ");
        // Testing with values: [1.0, true, -1, -50, Bumblebee]
        obj.classify(1.0f, true, -1, -50, "Bumblebee");
        // Testing with values: [1.0, true, -1, 10, ]
        obj.classify(1.0f, true, -1, 10, "");
        // Testing with values: [1.0, true, -1, 10,  ]
        obj.classify(1.0f, true, -1, 10, " ");
        // Testing with values: [1.0, true, -1, 10, Bumblebee]
        obj.classify(1.0f, true, -1, 10, "Bumblebee");
        // Testing with values: [1.0, true, 2, 0, ]
        obj.classify(1.0f, true, 2, 0, "");
        // Testing with values: [1.0, true, 2, 0,  ]
        obj.classify(1.0f, true, 2, 0, " ");
        // Testing with values: [1.0, true, 2, 0, Bumblebee]
        obj.classify(1.0f, true, 2, 0, "Bumblebee");
        // Testing with values: [1.0, true, 2, 1, ]
        obj.classify(1.0f, true, 2, 1, "");
        // Testing with values: [1.0, true, 2, 1,  ]
        obj.classify(1.0f, true, 2, 1, " ");
        // Testing with values: [1.0, true, 2, 1, Bumblebee]
        obj.classify(1.0f, true, 2, 1, "Bumblebee");
        // Testing with values: [1.0, true, 2, -1, ]
        obj.classify(1.0f, true, 2, -1, "");
        // Testing with values: [1.0, true, 2, -1,  ]
        obj.classify(1.0f, true, 2, -1, " ");
        // Testing with values: [1.0, true, 2, -1, Bumblebee]
        obj.classify(1.0f, true, 2, -1, "Bumblebee");
        // Testing with values: [1.0, true, 2, 8, ]
        obj.classify(1.0f, true, 2, 8, "");
        // Testing with values: [1.0, true, 2, 8,  ]
        obj.classify(1.0f, true, 2, 8, " ");
        // Testing with values: [1.0, true, 2, 8, Bumblebee]
        obj.classify(1.0f, true, 2, 8, "Bumblebee");
        // Testing with values: [1.0, true, 2, 9, ]
        obj.classify(1.0f, true, 2, 9, "");
        // Testing with values: [1.0, true, 2, 9,  ]
        obj.classify(1.0f, true, 2, 9, " ");
        // Testing with values: [1.0, true, 2, 9, Bumblebee]
        obj.classify(1.0f, true, 2, 9, "Bumblebee");
        // Testing with values: [1.0, true, 2, 50, ]
        obj.classify(1.0f, true, 2, 50, "");
        // Testing with values: [1.0, true, 2, 50,  ]
        obj.classify(1.0f, true, 2, 50, " ");
        // Testing with values: [1.0, true, 2, 50, Bumblebee]
        obj.classify(1.0f, true, 2, 50, "Bumblebee");
        // Testing with values: [1.0, true, 2, -50, ]
        obj.classify(1.0f, true, 2, -50, "");
        // Testing with values: [1.0, true, 2, -50,  ]
        obj.classify(1.0f, true, 2, -50, " ");
        // Testing with values: [1.0, true, 2, -50, Bumblebee]
        obj.classify(1.0f, true, 2, -50, "Bumblebee");
        // Testing with values: [1.0, true, 2, 10, ]
        obj.classify(1.0f, true, 2, 10, "");
        // Testing with values: [1.0, true, 2, 10,  ]
        obj.classify(1.0f, true, 2, 10, " ");
        // Testing with values: [1.0, true, 2, 10, Bumblebee]
        obj.classify(1.0f, true, 2, 10, "Bumblebee");
        // Testing with values: [1.0, true, 3, 0, ]
        obj.classify(1.0f, true, 3, 0, "");
        // Testing with values: [1.0, true, 3, 0,  ]
        obj.classify(1.0f, true, 3, 0, " ");
        // Testing with values: [1.0, true, 3, 0, Bumblebee]
        obj.classify(1.0f, true, 3, 0, "Bumblebee");
        // Testing with values: [1.0, true, 3, 1, ]
        obj.classify(1.0f, true, 3, 1, "");
        // Testing with values: [1.0, true, 3, 1,  ]
        obj.classify(1.0f, true, 3, 1, " ");
        // Testing with values: [1.0, true, 3, 1, Bumblebee]
        obj.classify(1.0f, true, 3, 1, "Bumblebee");
        // Testing with values: [1.0, true, 3, -1, ]
        obj.classify(1.0f, true, 3, -1, "");
        // Testing with values: [1.0, true, 3, -1,  ]
        obj.classify(1.0f, true, 3, -1, " ");
        // Testing with values: [1.0, true, 3, -1, Bumblebee]
        obj.classify(1.0f, true, 3, -1, "Bumblebee");
        // Testing with values: [1.0, true, 3, 8, ]
        obj.classify(1.0f, true, 3, 8, "");
        // Testing with values: [1.0, true, 3, 8,  ]
        obj.classify(1.0f, true, 3, 8, " ");
        // Testing with values: [1.0, true, 3, 8, Bumblebee]
        obj.classify(1.0f, true, 3, 8, "Bumblebee");
        // Testing with values: [1.0, true, 3, 9, ]
        obj.classify(1.0f, true, 3, 9, "");
        // Testing with values: [1.0, true, 3, 9,  ]
        obj.classify(1.0f, true, 3, 9, " ");
        // Testing with values: [1.0, true, 3, 9, Bumblebee]
        obj.classify(1.0f, true, 3, 9, "Bumblebee");
        // Testing with values: [1.0, true, 3, 50, ]
        obj.classify(1.0f, true, 3, 50, "");
        // Testing with values: [1.0, true, 3, 50,  ]
        obj.classify(1.0f, true, 3, 50, " ");
        // Testing with values: [1.0, true, 3, 50, Bumblebee]
        obj.classify(1.0f, true, 3, 50, "Bumblebee");
        // Testing with values: [1.0, true, 3, -50, ]
        obj.classify(1.0f, true, 3, -50, "");
        // Testing with values: [1.0, true, 3, -50,  ]
        obj.classify(1.0f, true, 3, -50, " ");
        // Testing with values: [1.0, true, 3, -50, Bumblebee]
        obj.classify(1.0f, true, 3, -50, "Bumblebee");
        // Testing with values: [1.0, true, 3, 10, ]
        obj.classify(1.0f, true, 3, 10, "");
        // Testing with values: [1.0, true, 3, 10,  ]
        obj.classify(1.0f, true, 3, 10, " ");
        // Testing with values: [1.0, true, 3, 10, Bumblebee]
        obj.classify(1.0f, true, 3, 10, "Bumblebee");
        // Testing with values: [1.0, false, 0, 0, ]
        obj.classify(1.0f, false, 0, 0, "");
        // Testing with values: [1.0, false, 0, 0,  ]
        obj.classify(1.0f, false, 0, 0, " ");
        // Testing with values: [1.0, false, 0, 0, Bumblebee]
        obj.classify(1.0f, false, 0, 0, "Bumblebee");
        // Testing with values: [1.0, false, 0, 1, ]
        obj.classify(1.0f, false, 0, 1, "");
        // Testing with values: [1.0, false, 0, 1,  ]
        obj.classify(1.0f, false, 0, 1, " ");
        // Testing with values: [1.0, false, 0, 1, Bumblebee]
        obj.classify(1.0f, false, 0, 1, "Bumblebee");
        // Testing with values: [1.0, false, 0, -1, ]
        obj.classify(1.0f, false, 0, -1, "");
        // Testing with values: [1.0, false, 0, -1,  ]
        obj.classify(1.0f, false, 0, -1, " ");
        // Testing with values: [1.0, false, 0, -1, Bumblebee]
        obj.classify(1.0f, false, 0, -1, "Bumblebee");
        // Testing with values: [1.0, false, 0, 8, ]
        obj.classify(1.0f, false, 0, 8, "");
        // Testing with values: [1.0, false, 0, 8,  ]
        obj.classify(1.0f, false, 0, 8, " ");
        // Testing with values: [1.0, false, 0, 8, Bumblebee]
        obj.classify(1.0f, false, 0, 8, "Bumblebee");
        // Testing with values: [1.0, false, 0, 9, ]
        obj.classify(1.0f, false, 0, 9, "");
        // Testing with values: [1.0, false, 0, 9,  ]
        obj.classify(1.0f, false, 0, 9, " ");
        // Testing with values: [1.0, false, 0, 9, Bumblebee]
        obj.classify(1.0f, false, 0, 9, "Bumblebee");
        // Testing with values: [1.0, false, 0, 50, ]
        obj.classify(1.0f, false, 0, 50, "");
        // Testing with values: [1.0, false, 0, 50,  ]
        obj.classify(1.0f, false, 0, 50, " ");
        // Testing with values: [1.0, false, 0, 50, Bumblebee]
        obj.classify(1.0f, false, 0, 50, "Bumblebee");
        // Testing with values: [1.0, false, 0, -50, ]
        obj.classify(1.0f, false, 0, -50, "");
        // Testing with values: [1.0, false, 0, -50,  ]
        obj.classify(1.0f, false, 0, -50, " ");
        // Testing with values: [1.0, false, 0, -50, Bumblebee]
        obj.classify(1.0f, false, 0, -50, "Bumblebee");
        // Testing with values: [1.0, false, 0, 10, ]
        obj.classify(1.0f, false, 0, 10, "");
        // Testing with values: [1.0, false, 0, 10,  ]
        obj.classify(1.0f, false, 0, 10, " ");
        // Testing with values: [1.0, false, 0, 10, Bumblebee]
        obj.classify(1.0f, false, 0, 10, "Bumblebee");
        // Testing with values: [1.0, false, 1, 0, ]
        obj.classify(1.0f, false, 1, 0, "");
        // Testing with values: [1.0, false, 1, 0,  ]
        obj.classify(1.0f, false, 1, 0, " ");
        // Testing with values: [1.0, false, 1, 0, Bumblebee]
        obj.classify(1.0f, false, 1, 0, "Bumblebee");
        // Testing with values: [1.0, false, 1, 1, ]
        obj.classify(1.0f, false, 1, 1, "");
        // Testing with values: [1.0, false, 1, 1,  ]
        obj.classify(1.0f, false, 1, 1, " ");
        // Testing with values: [1.0, false, 1, 1, Bumblebee]
        obj.classify(1.0f, false, 1, 1, "Bumblebee");
        // Testing with values: [1.0, false, 1, -1, ]
        obj.classify(1.0f, false, 1, -1, "");
        // Testing with values: [1.0, false, 1, -1,  ]
        obj.classify(1.0f, false, 1, -1, " ");
        // Testing with values: [1.0, false, 1, -1, Bumblebee]
        obj.classify(1.0f, false, 1, -1, "Bumblebee");
        // Testing with values: [1.0, false, 1, 8, ]
        obj.classify(1.0f, false, 1, 8, "");
        // Testing with values: [1.0, false, 1, 8,  ]
        obj.classify(1.0f, false, 1, 8, " ");
        // Testing with values: [1.0, false, 1, 8, Bumblebee]
        obj.classify(1.0f, false, 1, 8, "Bumblebee");
        // Testing with values: [1.0, false, 1, 9, ]
        obj.classify(1.0f, false, 1, 9, "");
        // Testing with values: [1.0, false, 1, 9,  ]
        obj.classify(1.0f, false, 1, 9, " ");
        // Testing with values: [1.0, false, 1, 9, Bumblebee]
        obj.classify(1.0f, false, 1, 9, "Bumblebee");
        // Testing with values: [1.0, false, 1, 50, ]
        obj.classify(1.0f, false, 1, 50, "");
        // Testing with values: [1.0, false, 1, 50,  ]
        obj.classify(1.0f, false, 1, 50, " ");
        // Testing with values: [1.0, false, 1, 50, Bumblebee]
        obj.classify(1.0f, false, 1, 50, "Bumblebee");
        // Testing with values: [1.0, false, 1, -50, ]
        obj.classify(1.0f, false, 1, -50, "");
        // Testing with values: [1.0, false, 1, -50,  ]
        obj.classify(1.0f, false, 1, -50, " ");
        // Testing with values: [1.0, false, 1, -50, Bumblebee]
        obj.classify(1.0f, false, 1, -50, "Bumblebee");
        // Testing with values: [1.0, false, 1, 10, ]
        obj.classify(1.0f, false, 1, 10, "");
        // Testing with values: [1.0, false, 1, 10,  ]
        obj.classify(1.0f, false, 1, 10, " ");
        // Testing with values: [1.0, false, 1, 10, Bumblebee]
        obj.classify(1.0f, false, 1, 10, "Bumblebee");
        // Testing with values: [1.0, false, -1, 0, ]
        obj.classify(1.0f, false, -1, 0, "");
        // Testing with values: [1.0, false, -1, 0,  ]
        obj.classify(1.0f, false, -1, 0, " ");
        // Testing with values: [1.0, false, -1, 0, Bumblebee]
        obj.classify(1.0f, false, -1, 0, "Bumblebee");
        // Testing with values: [1.0, false, -1, 1, ]
        obj.classify(1.0f, false, -1, 1, "");
        // Testing with values: [1.0, false, -1, 1,  ]
        obj.classify(1.0f, false, -1, 1, " ");
        // Testing with values: [1.0, false, -1, 1, Bumblebee]
        obj.classify(1.0f, false, -1, 1, "Bumblebee");
        // Testing with values: [1.0, false, -1, -1, ]
        obj.classify(1.0f, false, -1, -1, "");
        // Testing with values: [1.0, false, -1, -1,  ]
        obj.classify(1.0f, false, -1, -1, " ");
        // Testing with values: [1.0, false, -1, -1, Bumblebee]
        obj.classify(1.0f, false, -1, -1, "Bumblebee");
        // Testing with values: [1.0, false, -1, 8, ]
        obj.classify(1.0f, false, -1, 8, "");
        // Testing with values: [1.0, false, -1, 8,  ]
        obj.classify(1.0f, false, -1, 8, " ");
        // Testing with values: [1.0, false, -1, 8, Bumblebee]
        obj.classify(1.0f, false, -1, 8, "Bumblebee");
        // Testing with values: [1.0, false, -1, 9, ]
        obj.classify(1.0f, false, -1, 9, "");
        // Testing with values: [1.0, false, -1, 9,  ]
        obj.classify(1.0f, false, -1, 9, " ");
        // Testing with values: [1.0, false, -1, 9, Bumblebee]
        obj.classify(1.0f, false, -1, 9, "Bumblebee");
        // Testing with values: [1.0, false, -1, 50, ]
        obj.classify(1.0f, false, -1, 50, "");
        // Testing with values: [1.0, false, -1, 50,  ]
        obj.classify(1.0f, false, -1, 50, " ");
        // Testing with values: [1.0, false, -1, 50, Bumblebee]
        obj.classify(1.0f, false, -1, 50, "Bumblebee");
        // Testing with values: [1.0, false, -1, -50, ]
        obj.classify(1.0f, false, -1, -50, "");
        // Testing with values: [1.0, false, -1, -50,  ]
        obj.classify(1.0f, false, -1, -50, " ");
        // Testing with values: [1.0, false, -1, -50, Bumblebee]
        obj.classify(1.0f, false, -1, -50, "Bumblebee");
        // Testing with values: [1.0, false, -1, 10, ]
        obj.classify(1.0f, false, -1, 10, "");
        // Testing with values: [1.0, false, -1, 10,  ]
        obj.classify(1.0f, false, -1, 10, " ");
        // Testing with values: [1.0, false, -1, 10, Bumblebee]
        obj.classify(1.0f, false, -1, 10, "Bumblebee");
        // Testing with values: [1.0, false, 2, 0, ]
        obj.classify(1.0f, false, 2, 0, "");
        // Testing with values: [1.0, false, 2, 0,  ]
        obj.classify(1.0f, false, 2, 0, " ");
        // Testing with values: [1.0, false, 2, 0, Bumblebee]
        obj.classify(1.0f, false, 2, 0, "Bumblebee");
        // Testing with values: [1.0, false, 2, 1, ]
        obj.classify(1.0f, false, 2, 1, "");
        // Testing with values: [1.0, false, 2, 1,  ]
        obj.classify(1.0f, false, 2, 1, " ");
        // Testing with values: [1.0, false, 2, 1, Bumblebee]
        obj.classify(1.0f, false, 2, 1, "Bumblebee");
        // Testing with values: [1.0, false, 2, -1, ]
        obj.classify(1.0f, false, 2, -1, "");
        // Testing with values: [1.0, false, 2, -1,  ]
        obj.classify(1.0f, false, 2, -1, " ");
        // Testing with values: [1.0, false, 2, -1, Bumblebee]
        obj.classify(1.0f, false, 2, -1, "Bumblebee");
        // Testing with values: [1.0, false, 2, 8, ]
        obj.classify(1.0f, false, 2, 8, "");
        // Testing with values: [1.0, false, 2, 8,  ]
        obj.classify(1.0f, false, 2, 8, " ");
        // Testing with values: [1.0, false, 2, 8, Bumblebee]
        obj.classify(1.0f, false, 2, 8, "Bumblebee");
        // Testing with values: [1.0, false, 2, 9, ]
        obj.classify(1.0f, false, 2, 9, "");
        // Testing with values: [1.0, false, 2, 9,  ]
        obj.classify(1.0f, false, 2, 9, " ");
        // Testing with values: [1.0, false, 2, 9, Bumblebee]
        obj.classify(1.0f, false, 2, 9, "Bumblebee");
        // Testing with values: [1.0, false, 2, 50, ]
        obj.classify(1.0f, false, 2, 50, "");
        // Testing with values: [1.0, false, 2, 50,  ]
        obj.classify(1.0f, false, 2, 50, " ");
        // Testing with values: [1.0, false, 2, 50, Bumblebee]
        obj.classify(1.0f, false, 2, 50, "Bumblebee");
        // Testing with values: [1.0, false, 2, -50, ]
        obj.classify(1.0f, false, 2, -50, "");
        // Testing with values: [1.0, false, 2, -50,  ]
        obj.classify(1.0f, false, 2, -50, " ");
        // Testing with values: [1.0, false, 2, -50, Bumblebee]
        obj.classify(1.0f, false, 2, -50, "Bumblebee");
        // Testing with values: [1.0, false, 2, 10, ]
        obj.classify(1.0f, false, 2, 10, "");
        // Testing with values: [1.0, false, 2, 10,  ]
        obj.classify(1.0f, false, 2, 10, " ");
        // Testing with values: [1.0, false, 2, 10, Bumblebee]
        obj.classify(1.0f, false, 2, 10, "Bumblebee");
        // Testing with values: [1.0, false, 3, 0, ]
        obj.classify(1.0f, false, 3, 0, "");
        // Testing with values: [1.0, false, 3, 0,  ]
        obj.classify(1.0f, false, 3, 0, " ");
        // Testing with values: [1.0, false, 3, 0, Bumblebee]
        obj.classify(1.0f, false, 3, 0, "Bumblebee");
        // Testing with values: [1.0, false, 3, 1, ]
        obj.classify(1.0f, false, 3, 1, "");
        // Testing with values: [1.0, false, 3, 1,  ]
        obj.classify(1.0f, false, 3, 1, " ");
        // Testing with values: [1.0, false, 3, 1, Bumblebee]
        obj.classify(1.0f, false, 3, 1, "Bumblebee");
        // Testing with values: [1.0, false, 3, -1, ]
        obj.classify(1.0f, false, 3, -1, "");
        // Testing with values: [1.0, false, 3, -1,  ]
        obj.classify(1.0f, false, 3, -1, " ");
        // Testing with values: [1.0, false, 3, -1, Bumblebee]
        obj.classify(1.0f, false, 3, -1, "Bumblebee");
        // Testing with values: [1.0, false, 3, 8, ]
        obj.classify(1.0f, false, 3, 8, "");
        // Testing with values: [1.0, false, 3, 8,  ]
        obj.classify(1.0f, false, 3, 8, " ");
        // Testing with values: [1.0, false, 3, 8, Bumblebee]
        obj.classify(1.0f, false, 3, 8, "Bumblebee");
        // Testing with values: [1.0, false, 3, 9, ]
        obj.classify(1.0f, false, 3, 9, "");
        // Testing with values: [1.0, false, 3, 9,  ]
        obj.classify(1.0f, false, 3, 9, " ");
        // Testing with values: [1.0, false, 3, 9, Bumblebee]
        obj.classify(1.0f, false, 3, 9, "Bumblebee");
        // Testing with values: [1.0, false, 3, 50, ]
        obj.classify(1.0f, false, 3, 50, "");
        // Testing with values: [1.0, false, 3, 50,  ]
        obj.classify(1.0f, false, 3, 50, " ");
        // Testing with values: [1.0, false, 3, 50, Bumblebee]
        obj.classify(1.0f, false, 3, 50, "Bumblebee");
        // Testing with values: [1.0, false, 3, -50, ]
        obj.classify(1.0f, false, 3, -50, "");
        // Testing with values: [1.0, false, 3, -50,  ]
        obj.classify(1.0f, false, 3, -50, " ");
        // Testing with values: [1.0, false, 3, -50, Bumblebee]
        obj.classify(1.0f, false, 3, -50, "Bumblebee");
        // Testing with values: [1.0, false, 3, 10, ]
        obj.classify(1.0f, false, 3, 10, "");
        // Testing with values: [1.0, false, 3, 10,  ]
        obj.classify(1.0f, false, 3, 10, " ");
        // Testing with values: [1.0, false, 3, 10, Bumblebee]
        obj.classify(1.0f, false, 3, 10, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 0, ]
        obj.classify(-1.0f, true, 0, 0, "");
        // Testing with values: [-1.0, true, 0, 0,  ]
        obj.classify(-1.0f, true, 0, 0, " ");
        // Testing with values: [-1.0, true, 0, 0, Bumblebee]
        obj.classify(-1.0f, true, 0, 0, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 1, ]
        obj.classify(-1.0f, true, 0, 1, "");
        // Testing with values: [-1.0, true, 0, 1,  ]
        obj.classify(-1.0f, true, 0, 1, " ");
        // Testing with values: [-1.0, true, 0, 1, Bumblebee]
        obj.classify(-1.0f, true, 0, 1, "Bumblebee");
        // Testing with values: [-1.0, true, 0, -1, ]
        obj.classify(-1.0f, true, 0, -1, "");
        // Testing with values: [-1.0, true, 0, -1,  ]
        obj.classify(-1.0f, true, 0, -1, " ");
        // Testing with values: [-1.0, true, 0, -1, Bumblebee]
        obj.classify(-1.0f, true, 0, -1, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 8, ]
        obj.classify(-1.0f, true, 0, 8, "");
        // Testing with values: [-1.0, true, 0, 8,  ]
        obj.classify(-1.0f, true, 0, 8, " ");
        // Testing with values: [-1.0, true, 0, 8, Bumblebee]
        obj.classify(-1.0f, true, 0, 8, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 9, ]
        obj.classify(-1.0f, true, 0, 9, "");
        // Testing with values: [-1.0, true, 0, 9,  ]
        obj.classify(-1.0f, true, 0, 9, " ");
        // Testing with values: [-1.0, true, 0, 9, Bumblebee]
        obj.classify(-1.0f, true, 0, 9, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 50, ]
        obj.classify(-1.0f, true, 0, 50, "");
        // Testing with values: [-1.0, true, 0, 50,  ]
        obj.classify(-1.0f, true, 0, 50, " ");
        // Testing with values: [-1.0, true, 0, 50, Bumblebee]
        obj.classify(-1.0f, true, 0, 50, "Bumblebee");
        // Testing with values: [-1.0, true, 0, -50, ]
        obj.classify(-1.0f, true, 0, -50, "");
        // Testing with values: [-1.0, true, 0, -50,  ]
        obj.classify(-1.0f, true, 0, -50, " ");
        // Testing with values: [-1.0, true, 0, -50, Bumblebee]
        obj.classify(-1.0f, true, 0, -50, "Bumblebee");
        // Testing with values: [-1.0, true, 0, 10, ]
        obj.classify(-1.0f, true, 0, 10, "");
        // Testing with values: [-1.0, true, 0, 10,  ]
        obj.classify(-1.0f, true, 0, 10, " ");
        // Testing with values: [-1.0, true, 0, 10, Bumblebee]
        obj.classify(-1.0f, true, 0, 10, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 0, ]
        obj.classify(-1.0f, true, 1, 0, "");
        // Testing with values: [-1.0, true, 1, 0,  ]
        obj.classify(-1.0f, true, 1, 0, " ");
        // Testing with values: [-1.0, true, 1, 0, Bumblebee]
        obj.classify(-1.0f, true, 1, 0, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 1, ]
        obj.classify(-1.0f, true, 1, 1, "");
        // Testing with values: [-1.0, true, 1, 1,  ]
        obj.classify(-1.0f, true, 1, 1, " ");
        // Testing with values: [-1.0, true, 1, 1, Bumblebee]
        obj.classify(-1.0f, true, 1, 1, "Bumblebee");
        // Testing with values: [-1.0, true, 1, -1, ]
        obj.classify(-1.0f, true, 1, -1, "");
        // Testing with values: [-1.0, true, 1, -1,  ]
        obj.classify(-1.0f, true, 1, -1, " ");
        // Testing with values: [-1.0, true, 1, -1, Bumblebee]
        obj.classify(-1.0f, true, 1, -1, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 8, ]
        obj.classify(-1.0f, true, 1, 8, "");
        // Testing with values: [-1.0, true, 1, 8,  ]
        obj.classify(-1.0f, true, 1, 8, " ");
        // Testing with values: [-1.0, true, 1, 8, Bumblebee]
        obj.classify(-1.0f, true, 1, 8, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 9, ]
        obj.classify(-1.0f, true, 1, 9, "");
        // Testing with values: [-1.0, true, 1, 9,  ]
        obj.classify(-1.0f, true, 1, 9, " ");
        // Testing with values: [-1.0, true, 1, 9, Bumblebee]
        obj.classify(-1.0f, true, 1, 9, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 50, ]
        obj.classify(-1.0f, true, 1, 50, "");
        // Testing with values: [-1.0, true, 1, 50,  ]
        obj.classify(-1.0f, true, 1, 50, " ");
        // Testing with values: [-1.0, true, 1, 50, Bumblebee]
        obj.classify(-1.0f, true, 1, 50, "Bumblebee");
        // Testing with values: [-1.0, true, 1, -50, ]
        obj.classify(-1.0f, true, 1, -50, "");
        // Testing with values: [-1.0, true, 1, -50,  ]
        obj.classify(-1.0f, true, 1, -50, " ");
        // Testing with values: [-1.0, true, 1, -50, Bumblebee]
        obj.classify(-1.0f, true, 1, -50, "Bumblebee");
        // Testing with values: [-1.0, true, 1, 10, ]
        obj.classify(-1.0f, true, 1, 10, "");
        // Testing with values: [-1.0, true, 1, 10,  ]
        obj.classify(-1.0f, true, 1, 10, " ");
        // Testing with values: [-1.0, true, 1, 10, Bumblebee]
        obj.classify(-1.0f, true, 1, 10, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 0, ]
        obj.classify(-1.0f, true, -1, 0, "");
        // Testing with values: [-1.0, true, -1, 0,  ]
        obj.classify(-1.0f, true, -1, 0, " ");
        // Testing with values: [-1.0, true, -1, 0, Bumblebee]
        obj.classify(-1.0f, true, -1, 0, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 1, ]
        obj.classify(-1.0f, true, -1, 1, "");
        // Testing with values: [-1.0, true, -1, 1,  ]
        obj.classify(-1.0f, true, -1, 1, " ");
        // Testing with values: [-1.0, true, -1, 1, Bumblebee]
        obj.classify(-1.0f, true, -1, 1, "Bumblebee");
        // Testing with values: [-1.0, true, -1, -1, ]
        obj.classify(-1.0f, true, -1, -1, "");
        // Testing with values: [-1.0, true, -1, -1,  ]
        obj.classify(-1.0f, true, -1, -1, " ");
        // Testing with values: [-1.0, true, -1, -1, Bumblebee]
        obj.classify(-1.0f, true, -1, -1, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 8, ]
        obj.classify(-1.0f, true, -1, 8, "");
        // Testing with values: [-1.0, true, -1, 8,  ]
        obj.classify(-1.0f, true, -1, 8, " ");
        // Testing with values: [-1.0, true, -1, 8, Bumblebee]
        obj.classify(-1.0f, true, -1, 8, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 9, ]
        obj.classify(-1.0f, true, -1, 9, "");
        // Testing with values: [-1.0, true, -1, 9,  ]
        obj.classify(-1.0f, true, -1, 9, " ");
        // Testing with values: [-1.0, true, -1, 9, Bumblebee]
        obj.classify(-1.0f, true, -1, 9, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 50, ]
        obj.classify(-1.0f, true, -1, 50, "");
        // Testing with values: [-1.0, true, -1, 50,  ]
        obj.classify(-1.0f, true, -1, 50, " ");
        // Testing with values: [-1.0, true, -1, 50, Bumblebee]
        obj.classify(-1.0f, true, -1, 50, "Bumblebee");
        // Testing with values: [-1.0, true, -1, -50, ]
        obj.classify(-1.0f, true, -1, -50, "");
        // Testing with values: [-1.0, true, -1, -50,  ]
        obj.classify(-1.0f, true, -1, -50, " ");
        // Testing with values: [-1.0, true, -1, -50, Bumblebee]
        obj.classify(-1.0f, true, -1, -50, "Bumblebee");
        // Testing with values: [-1.0, true, -1, 10, ]
        obj.classify(-1.0f, true, -1, 10, "");
        // Testing with values: [-1.0, true, -1, 10,  ]
        obj.classify(-1.0f, true, -1, 10, " ");
        // Testing with values: [-1.0, true, -1, 10, Bumblebee]
        obj.classify(-1.0f, true, -1, 10, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 0, ]
        obj.classify(-1.0f, true, 2, 0, "");
        // Testing with values: [-1.0, true, 2, 0,  ]
        obj.classify(-1.0f, true, 2, 0, " ");
        // Testing with values: [-1.0, true, 2, 0, Bumblebee]
        obj.classify(-1.0f, true, 2, 0, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 1, ]
        obj.classify(-1.0f, true, 2, 1, "");
        // Testing with values: [-1.0, true, 2, 1,  ]
        obj.classify(-1.0f, true, 2, 1, " ");
        // Testing with values: [-1.0, true, 2, 1, Bumblebee]
        obj.classify(-1.0f, true, 2, 1, "Bumblebee");
        // Testing with values: [-1.0, true, 2, -1, ]
        obj.classify(-1.0f, true, 2, -1, "");
        // Testing with values: [-1.0, true, 2, -1,  ]
        obj.classify(-1.0f, true, 2, -1, " ");
        // Testing with values: [-1.0, true, 2, -1, Bumblebee]
        obj.classify(-1.0f, true, 2, -1, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 8, ]
        obj.classify(-1.0f, true, 2, 8, "");
        // Testing with values: [-1.0, true, 2, 8,  ]
        obj.classify(-1.0f, true, 2, 8, " ");
        // Testing with values: [-1.0, true, 2, 8, Bumblebee]
        obj.classify(-1.0f, true, 2, 8, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 9, ]
        obj.classify(-1.0f, true, 2, 9, "");
        // Testing with values: [-1.0, true, 2, 9,  ]
        obj.classify(-1.0f, true, 2, 9, " ");
        // Testing with values: [-1.0, true, 2, 9, Bumblebee]
        obj.classify(-1.0f, true, 2, 9, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 50, ]
        obj.classify(-1.0f, true, 2, 50, "");
        // Testing with values: [-1.0, true, 2, 50,  ]
        obj.classify(-1.0f, true, 2, 50, " ");
        // Testing with values: [-1.0, true, 2, 50, Bumblebee]
        obj.classify(-1.0f, true, 2, 50, "Bumblebee");
        // Testing with values: [-1.0, true, 2, -50, ]
        obj.classify(-1.0f, true, 2, -50, "");
        // Testing with values: [-1.0, true, 2, -50,  ]
        obj.classify(-1.0f, true, 2, -50, " ");
        // Testing with values: [-1.0, true, 2, -50, Bumblebee]
        obj.classify(-1.0f, true, 2, -50, "Bumblebee");
        // Testing with values: [-1.0, true, 2, 10, ]
        obj.classify(-1.0f, true, 2, 10, "");
        // Testing with values: [-1.0, true, 2, 10,  ]
        obj.classify(-1.0f, true, 2, 10, " ");
        // Testing with values: [-1.0, true, 2, 10, Bumblebee]
        obj.classify(-1.0f, true, 2, 10, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 0, ]
        obj.classify(-1.0f, true, 3, 0, "");
        // Testing with values: [-1.0, true, 3, 0,  ]
        obj.classify(-1.0f, true, 3, 0, " ");
        // Testing with values: [-1.0, true, 3, 0, Bumblebee]
        obj.classify(-1.0f, true, 3, 0, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 1, ]
        obj.classify(-1.0f, true, 3, 1, "");
        // Testing with values: [-1.0, true, 3, 1,  ]
        obj.classify(-1.0f, true, 3, 1, " ");
        // Testing with values: [-1.0, true, 3, 1, Bumblebee]
        obj.classify(-1.0f, true, 3, 1, "Bumblebee");
        // Testing with values: [-1.0, true, 3, -1, ]
        obj.classify(-1.0f, true, 3, -1, "");
        // Testing with values: [-1.0, true, 3, -1,  ]
        obj.classify(-1.0f, true, 3, -1, " ");
        // Testing with values: [-1.0, true, 3, -1, Bumblebee]
        obj.classify(-1.0f, true, 3, -1, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 8, ]
        obj.classify(-1.0f, true, 3, 8, "");
        // Testing with values: [-1.0, true, 3, 8,  ]
        obj.classify(-1.0f, true, 3, 8, " ");
        // Testing with values: [-1.0, true, 3, 8, Bumblebee]
        obj.classify(-1.0f, true, 3, 8, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 9, ]
        obj.classify(-1.0f, true, 3, 9, "");
        // Testing with values: [-1.0, true, 3, 9,  ]
        obj.classify(-1.0f, true, 3, 9, " ");
        // Testing with values: [-1.0, true, 3, 9, Bumblebee]
        obj.classify(-1.0f, true, 3, 9, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 50, ]
        obj.classify(-1.0f, true, 3, 50, "");
        // Testing with values: [-1.0, true, 3, 50,  ]
        obj.classify(-1.0f, true, 3, 50, " ");
        // Testing with values: [-1.0, true, 3, 50, Bumblebee]
        obj.classify(-1.0f, true, 3, 50, "Bumblebee");
        // Testing with values: [-1.0, true, 3, -50, ]
        obj.classify(-1.0f, true, 3, -50, "");
        // Testing with values: [-1.0, true, 3, -50,  ]
        obj.classify(-1.0f, true, 3, -50, " ");
        // Testing with values: [-1.0, true, 3, -50, Bumblebee]
        obj.classify(-1.0f, true, 3, -50, "Bumblebee");
        // Testing with values: [-1.0, true, 3, 10, ]
        obj.classify(-1.0f, true, 3, 10, "");
        // Testing with values: [-1.0, true, 3, 10,  ]
        obj.classify(-1.0f, true, 3, 10, " ");
        // Testing with values: [-1.0, true, 3, 10, Bumblebee]
        obj.classify(-1.0f, true, 3, 10, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 0, ]
        obj.classify(-1.0f, false, 0, 0, "");
        // Testing with values: [-1.0, false, 0, 0,  ]
        obj.classify(-1.0f, false, 0, 0, " ");
        // Testing with values: [-1.0, false, 0, 0, Bumblebee]
        obj.classify(-1.0f, false, 0, 0, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 1, ]
        obj.classify(-1.0f, false, 0, 1, "");
        // Testing with values: [-1.0, false, 0, 1,  ]
        obj.classify(-1.0f, false, 0, 1, " ");
        // Testing with values: [-1.0, false, 0, 1, Bumblebee]
        obj.classify(-1.0f, false, 0, 1, "Bumblebee");
        // Testing with values: [-1.0, false, 0, -1, ]
        obj.classify(-1.0f, false, 0, -1, "");
        // Testing with values: [-1.0, false, 0, -1,  ]
        obj.classify(-1.0f, false, 0, -1, " ");
        // Testing with values: [-1.0, false, 0, -1, Bumblebee]
        obj.classify(-1.0f, false, 0, -1, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 8, ]
        obj.classify(-1.0f, false, 0, 8, "");
        // Testing with values: [-1.0, false, 0, 8,  ]
        obj.classify(-1.0f, false, 0, 8, " ");
        // Testing with values: [-1.0, false, 0, 8, Bumblebee]
        obj.classify(-1.0f, false, 0, 8, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 9, ]
        obj.classify(-1.0f, false, 0, 9, "");
        // Testing with values: [-1.0, false, 0, 9,  ]
        obj.classify(-1.0f, false, 0, 9, " ");
        // Testing with values: [-1.0, false, 0, 9, Bumblebee]
        obj.classify(-1.0f, false, 0, 9, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 50, ]
        obj.classify(-1.0f, false, 0, 50, "");
        // Testing with values: [-1.0, false, 0, 50,  ]
        obj.classify(-1.0f, false, 0, 50, " ");
        // Testing with values: [-1.0, false, 0, 50, Bumblebee]
        obj.classify(-1.0f, false, 0, 50, "Bumblebee");
        // Testing with values: [-1.0, false, 0, -50, ]
        obj.classify(-1.0f, false, 0, -50, "");
        // Testing with values: [-1.0, false, 0, -50,  ]
        obj.classify(-1.0f, false, 0, -50, " ");
        // Testing with values: [-1.0, false, 0, -50, Bumblebee]
        obj.classify(-1.0f, false, 0, -50, "Bumblebee");
        // Testing with values: [-1.0, false, 0, 10, ]
        obj.classify(-1.0f, false, 0, 10, "");
        // Testing with values: [-1.0, false, 0, 10,  ]
        obj.classify(-1.0f, false, 0, 10, " ");
        // Testing with values: [-1.0, false, 0, 10, Bumblebee]
        obj.classify(-1.0f, false, 0, 10, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 0, ]
        obj.classify(-1.0f, false, 1, 0, "");
        // Testing with values: [-1.0, false, 1, 0,  ]
        obj.classify(-1.0f, false, 1, 0, " ");
        // Testing with values: [-1.0, false, 1, 0, Bumblebee]
        obj.classify(-1.0f, false, 1, 0, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 1, ]
        obj.classify(-1.0f, false, 1, 1, "");
        // Testing with values: [-1.0, false, 1, 1,  ]
        obj.classify(-1.0f, false, 1, 1, " ");
        // Testing with values: [-1.0, false, 1, 1, Bumblebee]
        obj.classify(-1.0f, false, 1, 1, "Bumblebee");
        // Testing with values: [-1.0, false, 1, -1, ]
        obj.classify(-1.0f, false, 1, -1, "");
        // Testing with values: [-1.0, false, 1, -1,  ]
        obj.classify(-1.0f, false, 1, -1, " ");
        // Testing with values: [-1.0, false, 1, -1, Bumblebee]
        obj.classify(-1.0f, false, 1, -1, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 8, ]
        obj.classify(-1.0f, false, 1, 8, "");
        // Testing with values: [-1.0, false, 1, 8,  ]
        obj.classify(-1.0f, false, 1, 8, " ");
        // Testing with values: [-1.0, false, 1, 8, Bumblebee]
        obj.classify(-1.0f, false, 1, 8, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 9, ]
        obj.classify(-1.0f, false, 1, 9, "");
        // Testing with values: [-1.0, false, 1, 9,  ]
        obj.classify(-1.0f, false, 1, 9, " ");
        // Testing with values: [-1.0, false, 1, 9, Bumblebee]
        obj.classify(-1.0f, false, 1, 9, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 50, ]
        obj.classify(-1.0f, false, 1, 50, "");
        // Testing with values: [-1.0, false, 1, 50,  ]
        obj.classify(-1.0f, false, 1, 50, " ");
        // Testing with values: [-1.0, false, 1, 50, Bumblebee]
        obj.classify(-1.0f, false, 1, 50, "Bumblebee");
        // Testing with values: [-1.0, false, 1, -50, ]
        obj.classify(-1.0f, false, 1, -50, "");
        // Testing with values: [-1.0, false, 1, -50,  ]
        obj.classify(-1.0f, false, 1, -50, " ");
        // Testing with values: [-1.0, false, 1, -50, Bumblebee]
        obj.classify(-1.0f, false, 1, -50, "Bumblebee");
        // Testing with values: [-1.0, false, 1, 10, ]
        obj.classify(-1.0f, false, 1, 10, "");
        // Testing with values: [-1.0, false, 1, 10,  ]
        obj.classify(-1.0f, false, 1, 10, " ");
        // Testing with values: [-1.0, false, 1, 10, Bumblebee]
        obj.classify(-1.0f, false, 1, 10, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 0, ]
        obj.classify(-1.0f, false, -1, 0, "");
        // Testing with values: [-1.0, false, -1, 0,  ]
        obj.classify(-1.0f, false, -1, 0, " ");
        // Testing with values: [-1.0, false, -1, 0, Bumblebee]
        obj.classify(-1.0f, false, -1, 0, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 1, ]
        obj.classify(-1.0f, false, -1, 1, "");
        // Testing with values: [-1.0, false, -1, 1,  ]
        obj.classify(-1.0f, false, -1, 1, " ");
        // Testing with values: [-1.0, false, -1, 1, Bumblebee]
        obj.classify(-1.0f, false, -1, 1, "Bumblebee");
        // Testing with values: [-1.0, false, -1, -1, ]
        obj.classify(-1.0f, false, -1, -1, "");
        // Testing with values: [-1.0, false, -1, -1,  ]
        obj.classify(-1.0f, false, -1, -1, " ");
        // Testing with values: [-1.0, false, -1, -1, Bumblebee]
        obj.classify(-1.0f, false, -1, -1, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 8, ]
        obj.classify(-1.0f, false, -1, 8, "");
        // Testing with values: [-1.0, false, -1, 8,  ]
        obj.classify(-1.0f, false, -1, 8, " ");
        // Testing with values: [-1.0, false, -1, 8, Bumblebee]
        obj.classify(-1.0f, false, -1, 8, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 9, ]
        obj.classify(-1.0f, false, -1, 9, "");
        // Testing with values: [-1.0, false, -1, 9,  ]
        obj.classify(-1.0f, false, -1, 9, " ");
        // Testing with values: [-1.0, false, -1, 9, Bumblebee]
        obj.classify(-1.0f, false, -1, 9, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 50, ]
        obj.classify(-1.0f, false, -1, 50, "");
        // Testing with values: [-1.0, false, -1, 50,  ]
        obj.classify(-1.0f, false, -1, 50, " ");
        // Testing with values: [-1.0, false, -1, 50, Bumblebee]
        obj.classify(-1.0f, false, -1, 50, "Bumblebee");
        // Testing with values: [-1.0, false, -1, -50, ]
        obj.classify(-1.0f, false, -1, -50, "");
        // Testing with values: [-1.0, false, -1, -50,  ]
        obj.classify(-1.0f, false, -1, -50, " ");
        // Testing with values: [-1.0, false, -1, -50, Bumblebee]
        obj.classify(-1.0f, false, -1, -50, "Bumblebee");
        // Testing with values: [-1.0, false, -1, 10, ]
        obj.classify(-1.0f, false, -1, 10, "");
        // Testing with values: [-1.0, false, -1, 10,  ]
        obj.classify(-1.0f, false, -1, 10, " ");
        // Testing with values: [-1.0, false, -1, 10, Bumblebee]
        obj.classify(-1.0f, false, -1, 10, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 0, ]
        obj.classify(-1.0f, false, 2, 0, "");
        // Testing with values: [-1.0, false, 2, 0,  ]
        obj.classify(-1.0f, false, 2, 0, " ");
        // Testing with values: [-1.0, false, 2, 0, Bumblebee]
        obj.classify(-1.0f, false, 2, 0, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 1, ]
        obj.classify(-1.0f, false, 2, 1, "");
        // Testing with values: [-1.0, false, 2, 1,  ]
        obj.classify(-1.0f, false, 2, 1, " ");
        // Testing with values: [-1.0, false, 2, 1, Bumblebee]
        obj.classify(-1.0f, false, 2, 1, "Bumblebee");
        // Testing with values: [-1.0, false, 2, -1, ]
        obj.classify(-1.0f, false, 2, -1, "");
        // Testing with values: [-1.0, false, 2, -1,  ]
        obj.classify(-1.0f, false, 2, -1, " ");
        // Testing with values: [-1.0, false, 2, -1, Bumblebee]
        obj.classify(-1.0f, false, 2, -1, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 8, ]
        obj.classify(-1.0f, false, 2, 8, "");
        // Testing with values: [-1.0, false, 2, 8,  ]
        obj.classify(-1.0f, false, 2, 8, " ");
        // Testing with values: [-1.0, false, 2, 8, Bumblebee]
        obj.classify(-1.0f, false, 2, 8, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 9, ]
        obj.classify(-1.0f, false, 2, 9, "");
        // Testing with values: [-1.0, false, 2, 9,  ]
        obj.classify(-1.0f, false, 2, 9, " ");
        // Testing with values: [-1.0, false, 2, 9, Bumblebee]
        obj.classify(-1.0f, false, 2, 9, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 50, ]
        obj.classify(-1.0f, false, 2, 50, "");
        // Testing with values: [-1.0, false, 2, 50,  ]
        obj.classify(-1.0f, false, 2, 50, " ");
        // Testing with values: [-1.0, false, 2, 50, Bumblebee]
        obj.classify(-1.0f, false, 2, 50, "Bumblebee");
        // Testing with values: [-1.0, false, 2, -50, ]
        obj.classify(-1.0f, false, 2, -50, "");
        // Testing with values: [-1.0, false, 2, -50,  ]
        obj.classify(-1.0f, false, 2, -50, " ");
        // Testing with values: [-1.0, false, 2, -50, Bumblebee]
        obj.classify(-1.0f, false, 2, -50, "Bumblebee");
        // Testing with values: [-1.0, false, 2, 10, ]
        obj.classify(-1.0f, false, 2, 10, "");
        // Testing with values: [-1.0, false, 2, 10,  ]
        obj.classify(-1.0f, false, 2, 10, " ");
        // Testing with values: [-1.0, false, 2, 10, Bumblebee]
        obj.classify(-1.0f, false, 2, 10, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 0, ]
        obj.classify(-1.0f, false, 3, 0, "");
        // Testing with values: [-1.0, false, 3, 0,  ]
        obj.classify(-1.0f, false, 3, 0, " ");
        // Testing with values: [-1.0, false, 3, 0, Bumblebee]
        obj.classify(-1.0f, false, 3, 0, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 1, ]
        obj.classify(-1.0f, false, 3, 1, "");
        // Testing with values: [-1.0, false, 3, 1,  ]
        obj.classify(-1.0f, false, 3, 1, " ");
        // Testing with values: [-1.0, false, 3, 1, Bumblebee]
        obj.classify(-1.0f, false, 3, 1, "Bumblebee");
        // Testing with values: [-1.0, false, 3, -1, ]
        obj.classify(-1.0f, false, 3, -1, "");
        // Testing with values: [-1.0, false, 3, -1,  ]
        obj.classify(-1.0f, false, 3, -1, " ");
        // Testing with values: [-1.0, false, 3, -1, Bumblebee]
        obj.classify(-1.0f, false, 3, -1, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 8, ]
        obj.classify(-1.0f, false, 3, 8, "");
        // Testing with values: [-1.0, false, 3, 8,  ]
        obj.classify(-1.0f, false, 3, 8, " ");
        // Testing with values: [-1.0, false, 3, 8, Bumblebee]
        obj.classify(-1.0f, false, 3, 8, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 9, ]
        obj.classify(-1.0f, false, 3, 9, "");
        // Testing with values: [-1.0, false, 3, 9,  ]
        obj.classify(-1.0f, false, 3, 9, " ");
        // Testing with values: [-1.0, false, 3, 9, Bumblebee]
        obj.classify(-1.0f, false, 3, 9, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 50, ]
        obj.classify(-1.0f, false, 3, 50, "");
        // Testing with values: [-1.0, false, 3, 50,  ]
        obj.classify(-1.0f, false, 3, 50, " ");
        // Testing with values: [-1.0, false, 3, 50, Bumblebee]
        obj.classify(-1.0f, false, 3, 50, "Bumblebee");
        // Testing with values: [-1.0, false, 3, -50, ]
        obj.classify(-1.0f, false, 3, -50, "");
        // Testing with values: [-1.0, false, 3, -50,  ]
        obj.classify(-1.0f, false, 3, -50, " ");
        // Testing with values: [-1.0, false, 3, -50, Bumblebee]
        obj.classify(-1.0f, false, 3, -50, "Bumblebee");
        // Testing with values: [-1.0, false, 3, 10, ]
        obj.classify(-1.0f, false, 3, 10, "");
        // Testing with values: [-1.0, false, 3, 10,  ]
        obj.classify(-1.0f, false, 3, 10, " ");
        // Testing with values: [-1.0, false, 3, 10, Bumblebee]
        obj.classify(-1.0f, false, 3, 10, "Bumblebee");
    }
}
