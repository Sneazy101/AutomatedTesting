import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BranchTarget_classifyTest {

    @Test
    public void test_classify() {
        BranchTarget obj = new BranchTarget();

        // Testing with values: [0.0, true, true, 0, ]
        obj.classify(0.0f, true, true, 0, "");
        // Testing with values: [0.0, true, true, 0,  ]
        obj.classify(0.0f, true, true, 0, " ");
        // Testing with values: [0.0, true, true, 0, null]
        obj.classify(0.0f, true, true, 0, "null");
        // Testing with values: [0.0, true, true, 0, bumblebee]
        obj.classify(0.0f, true, true, 0, "bumblebee");
        // Testing with values: [0.0, true, true, 1, ]
        obj.classify(0.0f, true, true, 1, "");
        // Testing with values: [0.0, true, true, 1,  ]
        obj.classify(0.0f, true, true, 1, " ");
        // Testing with values: [0.0, true, true, 1, null]
        obj.classify(0.0f, true, true, 1, "null");
        // Testing with values: [0.0, true, true, 1, bumblebee]
        obj.classify(0.0f, true, true, 1, "bumblebee");
        // Testing with values: [0.0, true, true, -1, ]
        obj.classify(0.0f, true, true, -1, "");
        // Testing with values: [0.0, true, true, -1,  ]
        obj.classify(0.0f, true, true, -1, " ");
        // Testing with values: [0.0, true, true, -1, null]
        obj.classify(0.0f, true, true, -1, "null");
        // Testing with values: [0.0, true, true, -1, bumblebee]
        obj.classify(0.0f, true, true, -1, "bumblebee");
        // Testing with values: [0.0, true, true, 10, ]
        obj.classify(0.0f, true, true, 10, "");
        // Testing with values: [0.0, true, true, 10,  ]
        obj.classify(0.0f, true, true, 10, " ");
        // Testing with values: [0.0, true, true, 10, null]
        obj.classify(0.0f, true, true, 10, "null");
        // Testing with values: [0.0, true, true, 10, bumblebee]
        obj.classify(0.0f, true, true, 10, "bumblebee");
        // Testing with values: [0.0, true, true, 11, ]
        obj.classify(0.0f, true, true, 11, "");
        // Testing with values: [0.0, true, true, 11,  ]
        obj.classify(0.0f, true, true, 11, " ");
        // Testing with values: [0.0, true, true, 11, null]
        obj.classify(0.0f, true, true, 11, "null");
        // Testing with values: [0.0, true, true, 11, bumblebee]
        obj.classify(0.0f, true, true, 11, "bumblebee");
        // Testing with values: [0.0, true, true, 20, ]
        obj.classify(0.0f, true, true, 20, "");
        // Testing with values: [0.0, true, true, 20,  ]
        obj.classify(0.0f, true, true, 20, " ");
        // Testing with values: [0.0, true, true, 20, null]
        obj.classify(0.0f, true, true, 20, "null");
        // Testing with values: [0.0, true, true, 20, bumblebee]
        obj.classify(0.0f, true, true, 20, "bumblebee");
        // Testing with values: [0.0, true, true, 21, ]
        obj.classify(0.0f, true, true, 21, "");
        // Testing with values: [0.0, true, true, 21,  ]
        obj.classify(0.0f, true, true, 21, " ");
        // Testing with values: [0.0, true, true, 21, null]
        obj.classify(0.0f, true, true, 21, "null");
        // Testing with values: [0.0, true, true, 21, bumblebee]
        obj.classify(0.0f, true, true, 21, "bumblebee");
        // Testing with values: [0.0, true, true, 2, ]
        obj.classify(0.0f, true, true, 2, "");
        // Testing with values: [0.0, true, true, 2,  ]
        obj.classify(0.0f, true, true, 2, " ");
        // Testing with values: [0.0, true, true, 2, null]
        obj.classify(0.0f, true, true, 2, "null");
        // Testing with values: [0.0, true, true, 2, bumblebee]
        obj.classify(0.0f, true, true, 2, "bumblebee");
        // Testing with values: [0.0, true, true, 3, ]
        obj.classify(0.0f, true, true, 3, "");
        // Testing with values: [0.0, true, true, 3,  ]
        obj.classify(0.0f, true, true, 3, " ");
        // Testing with values: [0.0, true, true, 3, null]
        obj.classify(0.0f, true, true, 3, "null");
        // Testing with values: [0.0, true, true, 3, bumblebee]
        obj.classify(0.0f, true, true, 3, "bumblebee");
        // Testing with values: [0.0, true, false, 0, ]
        obj.classify(0.0f, true, false, 0, "");
        // Testing with values: [0.0, true, false, 0,  ]
        obj.classify(0.0f, true, false, 0, " ");
        // Testing with values: [0.0, true, false, 0, null]
        obj.classify(0.0f, true, false, 0, "null");
        // Testing with values: [0.0, true, false, 0, bumblebee]
        obj.classify(0.0f, true, false, 0, "bumblebee");
        // Testing with values: [0.0, true, false, 1, ]
        obj.classify(0.0f, true, false, 1, "");
        // Testing with values: [0.0, true, false, 1,  ]
        obj.classify(0.0f, true, false, 1, " ");
        // Testing with values: [0.0, true, false, 1, null]
        obj.classify(0.0f, true, false, 1, "null");
        // Testing with values: [0.0, true, false, 1, bumblebee]
        obj.classify(0.0f, true, false, 1, "bumblebee");
        // Testing with values: [0.0, true, false, -1, ]
        obj.classify(0.0f, true, false, -1, "");
        // Testing with values: [0.0, true, false, -1,  ]
        obj.classify(0.0f, true, false, -1, " ");
        // Testing with values: [0.0, true, false, -1, null]
        obj.classify(0.0f, true, false, -1, "null");
        // Testing with values: [0.0, true, false, -1, bumblebee]
        obj.classify(0.0f, true, false, -1, "bumblebee");
        // Testing with values: [0.0, true, false, 10, ]
        obj.classify(0.0f, true, false, 10, "");
        // Testing with values: [0.0, true, false, 10,  ]
        obj.classify(0.0f, true, false, 10, " ");
        // Testing with values: [0.0, true, false, 10, null]
        obj.classify(0.0f, true, false, 10, "null");
        // Testing with values: [0.0, true, false, 10, bumblebee]
        obj.classify(0.0f, true, false, 10, "bumblebee");
        // Testing with values: [0.0, true, false, 11, ]
        obj.classify(0.0f, true, false, 11, "");
        // Testing with values: [0.0, true, false, 11,  ]
        obj.classify(0.0f, true, false, 11, " ");
        // Testing with values: [0.0, true, false, 11, null]
        obj.classify(0.0f, true, false, 11, "null");
        // Testing with values: [0.0, true, false, 11, bumblebee]
        obj.classify(0.0f, true, false, 11, "bumblebee");
        // Testing with values: [0.0, true, false, 20, ]
        obj.classify(0.0f, true, false, 20, "");
        // Testing with values: [0.0, true, false, 20,  ]
        obj.classify(0.0f, true, false, 20, " ");
        // Testing with values: [0.0, true, false, 20, null]
        obj.classify(0.0f, true, false, 20, "null");
        // Testing with values: [0.0, true, false, 20, bumblebee]
        obj.classify(0.0f, true, false, 20, "bumblebee");
        // Testing with values: [0.0, true, false, 21, ]
        obj.classify(0.0f, true, false, 21, "");
        // Testing with values: [0.0, true, false, 21,  ]
        obj.classify(0.0f, true, false, 21, " ");
        // Testing with values: [0.0, true, false, 21, null]
        obj.classify(0.0f, true, false, 21, "null");
        // Testing with values: [0.0, true, false, 21, bumblebee]
        obj.classify(0.0f, true, false, 21, "bumblebee");
        // Testing with values: [0.0, true, false, 2, ]
        obj.classify(0.0f, true, false, 2, "");
        // Testing with values: [0.0, true, false, 2,  ]
        obj.classify(0.0f, true, false, 2, " ");
        // Testing with values: [0.0, true, false, 2, null]
        obj.classify(0.0f, true, false, 2, "null");
        // Testing with values: [0.0, true, false, 2, bumblebee]
        obj.classify(0.0f, true, false, 2, "bumblebee");
        // Testing with values: [0.0, true, false, 3, ]
        obj.classify(0.0f, true, false, 3, "");
        // Testing with values: [0.0, true, false, 3,  ]
        obj.classify(0.0f, true, false, 3, " ");
        // Testing with values: [0.0, true, false, 3, null]
        obj.classify(0.0f, true, false, 3, "null");
        // Testing with values: [0.0, true, false, 3, bumblebee]
        obj.classify(0.0f, true, false, 3, "bumblebee");
        // Testing with values: [0.0, false, true, 0, ]
        obj.classify(0.0f, false, true, 0, "");
        // Testing with values: [0.0, false, true, 0,  ]
        obj.classify(0.0f, false, true, 0, " ");
        // Testing with values: [0.0, false, true, 0, null]
        obj.classify(0.0f, false, true, 0, "null");
        // Testing with values: [0.0, false, true, 0, bumblebee]
        obj.classify(0.0f, false, true, 0, "bumblebee");
        // Testing with values: [0.0, false, true, 1, ]
        obj.classify(0.0f, false, true, 1, "");
        // Testing with values: [0.0, false, true, 1,  ]
        obj.classify(0.0f, false, true, 1, " ");
        // Testing with values: [0.0, false, true, 1, null]
        obj.classify(0.0f, false, true, 1, "null");
        // Testing with values: [0.0, false, true, 1, bumblebee]
        obj.classify(0.0f, false, true, 1, "bumblebee");
        // Testing with values: [0.0, false, true, -1, ]
        obj.classify(0.0f, false, true, -1, "");
        // Testing with values: [0.0, false, true, -1,  ]
        obj.classify(0.0f, false, true, -1, " ");
        // Testing with values: [0.0, false, true, -1, null]
        obj.classify(0.0f, false, true, -1, "null");
        // Testing with values: [0.0, false, true, -1, bumblebee]
        obj.classify(0.0f, false, true, -1, "bumblebee");
        // Testing with values: [0.0, false, true, 10, ]
        obj.classify(0.0f, false, true, 10, "");
        // Testing with values: [0.0, false, true, 10,  ]
        obj.classify(0.0f, false, true, 10, " ");
        // Testing with values: [0.0, false, true, 10, null]
        obj.classify(0.0f, false, true, 10, "null");
        // Testing with values: [0.0, false, true, 10, bumblebee]
        obj.classify(0.0f, false, true, 10, "bumblebee");
        // Testing with values: [0.0, false, true, 11, ]
        obj.classify(0.0f, false, true, 11, "");
        // Testing with values: [0.0, false, true, 11,  ]
        obj.classify(0.0f, false, true, 11, " ");
        // Testing with values: [0.0, false, true, 11, null]
        obj.classify(0.0f, false, true, 11, "null");
        // Testing with values: [0.0, false, true, 11, bumblebee]
        obj.classify(0.0f, false, true, 11, "bumblebee");
        // Testing with values: [0.0, false, true, 20, ]
        obj.classify(0.0f, false, true, 20, "");
        // Testing with values: [0.0, false, true, 20,  ]
        obj.classify(0.0f, false, true, 20, " ");
        // Testing with values: [0.0, false, true, 20, null]
        obj.classify(0.0f, false, true, 20, "null");
        // Testing with values: [0.0, false, true, 20, bumblebee]
        obj.classify(0.0f, false, true, 20, "bumblebee");
        // Testing with values: [0.0, false, true, 21, ]
        obj.classify(0.0f, false, true, 21, "");
        // Testing with values: [0.0, false, true, 21,  ]
        obj.classify(0.0f, false, true, 21, " ");
        // Testing with values: [0.0, false, true, 21, null]
        obj.classify(0.0f, false, true, 21, "null");
        // Testing with values: [0.0, false, true, 21, bumblebee]
        obj.classify(0.0f, false, true, 21, "bumblebee");
        // Testing with values: [0.0, false, true, 2, ]
        obj.classify(0.0f, false, true, 2, "");
        // Testing with values: [0.0, false, true, 2,  ]
        obj.classify(0.0f, false, true, 2, " ");
        // Testing with values: [0.0, false, true, 2, null]
        obj.classify(0.0f, false, true, 2, "null");
        // Testing with values: [0.0, false, true, 2, bumblebee]
        obj.classify(0.0f, false, true, 2, "bumblebee");
        // Testing with values: [0.0, false, true, 3, ]
        obj.classify(0.0f, false, true, 3, "");
        // Testing with values: [0.0, false, true, 3,  ]
        obj.classify(0.0f, false, true, 3, " ");
        // Testing with values: [0.0, false, true, 3, null]
        obj.classify(0.0f, false, true, 3, "null");
        // Testing with values: [0.0, false, true, 3, bumblebee]
        obj.classify(0.0f, false, true, 3, "bumblebee");
        // Testing with values: [0.0, false, false, 0, ]
        obj.classify(0.0f, false, false, 0, "");
        // Testing with values: [0.0, false, false, 0,  ]
        obj.classify(0.0f, false, false, 0, " ");
        // Testing with values: [0.0, false, false, 0, null]
        obj.classify(0.0f, false, false, 0, "null");
        // Testing with values: [0.0, false, false, 0, bumblebee]
        obj.classify(0.0f, false, false, 0, "bumblebee");
        // Testing with values: [0.0, false, false, 1, ]
        obj.classify(0.0f, false, false, 1, "");
        // Testing with values: [0.0, false, false, 1,  ]
        obj.classify(0.0f, false, false, 1, " ");
        // Testing with values: [0.0, false, false, 1, null]
        obj.classify(0.0f, false, false, 1, "null");
        // Testing with values: [0.0, false, false, 1, bumblebee]
        obj.classify(0.0f, false, false, 1, "bumblebee");
        // Testing with values: [0.0, false, false, -1, ]
        obj.classify(0.0f, false, false, -1, "");
        // Testing with values: [0.0, false, false, -1,  ]
        obj.classify(0.0f, false, false, -1, " ");
        // Testing with values: [0.0, false, false, -1, null]
        obj.classify(0.0f, false, false, -1, "null");
        // Testing with values: [0.0, false, false, -1, bumblebee]
        obj.classify(0.0f, false, false, -1, "bumblebee");
        // Testing with values: [0.0, false, false, 10, ]
        obj.classify(0.0f, false, false, 10, "");
        // Testing with values: [0.0, false, false, 10,  ]
        obj.classify(0.0f, false, false, 10, " ");
        // Testing with values: [0.0, false, false, 10, null]
        obj.classify(0.0f, false, false, 10, "null");
        // Testing with values: [0.0, false, false, 10, bumblebee]
        obj.classify(0.0f, false, false, 10, "bumblebee");
        // Testing with values: [0.0, false, false, 11, ]
        obj.classify(0.0f, false, false, 11, "");
        // Testing with values: [0.0, false, false, 11,  ]
        obj.classify(0.0f, false, false, 11, " ");
        // Testing with values: [0.0, false, false, 11, null]
        obj.classify(0.0f, false, false, 11, "null");
        // Testing with values: [0.0, false, false, 11, bumblebee]
        obj.classify(0.0f, false, false, 11, "bumblebee");
        // Testing with values: [0.0, false, false, 20, ]
        obj.classify(0.0f, false, false, 20, "");
        // Testing with values: [0.0, false, false, 20,  ]
        obj.classify(0.0f, false, false, 20, " ");
        // Testing with values: [0.0, false, false, 20, null]
        obj.classify(0.0f, false, false, 20, "null");
        // Testing with values: [0.0, false, false, 20, bumblebee]
        obj.classify(0.0f, false, false, 20, "bumblebee");
        // Testing with values: [0.0, false, false, 21, ]
        obj.classify(0.0f, false, false, 21, "");
        // Testing with values: [0.0, false, false, 21,  ]
        obj.classify(0.0f, false, false, 21, " ");
        // Testing with values: [0.0, false, false, 21, null]
        obj.classify(0.0f, false, false, 21, "null");
        // Testing with values: [0.0, false, false, 21, bumblebee]
        obj.classify(0.0f, false, false, 21, "bumblebee");
        // Testing with values: [0.0, false, false, 2, ]
        obj.classify(0.0f, false, false, 2, "");
        // Testing with values: [0.0, false, false, 2,  ]
        obj.classify(0.0f, false, false, 2, " ");
        // Testing with values: [0.0, false, false, 2, null]
        obj.classify(0.0f, false, false, 2, "null");
        // Testing with values: [0.0, false, false, 2, bumblebee]
        obj.classify(0.0f, false, false, 2, "bumblebee");
        // Testing with values: [0.0, false, false, 3, ]
        obj.classify(0.0f, false, false, 3, "");
        // Testing with values: [0.0, false, false, 3,  ]
        obj.classify(0.0f, false, false, 3, " ");
        // Testing with values: [0.0, false, false, 3, null]
        obj.classify(0.0f, false, false, 3, "null");
        // Testing with values: [0.0, false, false, 3, bumblebee]
        obj.classify(0.0f, false, false, 3, "bumblebee");
        // Testing with values: [1.0, true, true, 0, ]
        obj.classify(1.0f, true, true, 0, "");
        // Testing with values: [1.0, true, true, 0,  ]
        obj.classify(1.0f, true, true, 0, " ");
        // Testing with values: [1.0, true, true, 0, null]
        obj.classify(1.0f, true, true, 0, "null");
        // Testing with values: [1.0, true, true, 0, bumblebee]
        obj.classify(1.0f, true, true, 0, "bumblebee");
        // Testing with values: [1.0, true, true, 1, ]
        obj.classify(1.0f, true, true, 1, "");
        // Testing with values: [1.0, true, true, 1,  ]
        obj.classify(1.0f, true, true, 1, " ");
        // Testing with values: [1.0, true, true, 1, null]
        obj.classify(1.0f, true, true, 1, "null");
        // Testing with values: [1.0, true, true, 1, bumblebee]
        obj.classify(1.0f, true, true, 1, "bumblebee");
        // Testing with values: [1.0, true, true, -1, ]
        obj.classify(1.0f, true, true, -1, "");
        // Testing with values: [1.0, true, true, -1,  ]
        obj.classify(1.0f, true, true, -1, " ");
        // Testing with values: [1.0, true, true, -1, null]
        obj.classify(1.0f, true, true, -1, "null");
        // Testing with values: [1.0, true, true, -1, bumblebee]
        obj.classify(1.0f, true, true, -1, "bumblebee");
        // Testing with values: [1.0, true, true, 10, ]
        obj.classify(1.0f, true, true, 10, "");
        // Testing with values: [1.0, true, true, 10,  ]
        obj.classify(1.0f, true, true, 10, " ");
        // Testing with values: [1.0, true, true, 10, null]
        obj.classify(1.0f, true, true, 10, "null");
        // Testing with values: [1.0, true, true, 10, bumblebee]
        obj.classify(1.0f, true, true, 10, "bumblebee");
        // Testing with values: [1.0, true, true, 11, ]
        obj.classify(1.0f, true, true, 11, "");
        // Testing with values: [1.0, true, true, 11,  ]
        obj.classify(1.0f, true, true, 11, " ");
        // Testing with values: [1.0, true, true, 11, null]
        obj.classify(1.0f, true, true, 11, "null");
        // Testing with values: [1.0, true, true, 11, bumblebee]
        obj.classify(1.0f, true, true, 11, "bumblebee");
        // Testing with values: [1.0, true, true, 20, ]
        obj.classify(1.0f, true, true, 20, "");
        // Testing with values: [1.0, true, true, 20,  ]
        obj.classify(1.0f, true, true, 20, " ");
        // Testing with values: [1.0, true, true, 20, null]
        obj.classify(1.0f, true, true, 20, "null");
        // Testing with values: [1.0, true, true, 20, bumblebee]
        obj.classify(1.0f, true, true, 20, "bumblebee");
        // Testing with values: [1.0, true, true, 21, ]
        obj.classify(1.0f, true, true, 21, "");
        // Testing with values: [1.0, true, true, 21,  ]
        obj.classify(1.0f, true, true, 21, " ");
        // Testing with values: [1.0, true, true, 21, null]
        obj.classify(1.0f, true, true, 21, "null");
        // Testing with values: [1.0, true, true, 21, bumblebee]
        obj.classify(1.0f, true, true, 21, "bumblebee");
        // Testing with values: [1.0, true, true, 2, ]
        obj.classify(1.0f, true, true, 2, "");
        // Testing with values: [1.0, true, true, 2,  ]
        obj.classify(1.0f, true, true, 2, " ");
        // Testing with values: [1.0, true, true, 2, null]
        obj.classify(1.0f, true, true, 2, "null");
        // Testing with values: [1.0, true, true, 2, bumblebee]
        obj.classify(1.0f, true, true, 2, "bumblebee");
        // Testing with values: [1.0, true, true, 3, ]
        obj.classify(1.0f, true, true, 3, "");
        // Testing with values: [1.0, true, true, 3,  ]
        obj.classify(1.0f, true, true, 3, " ");
        // Testing with values: [1.0, true, true, 3, null]
        obj.classify(1.0f, true, true, 3, "null");
        // Testing with values: [1.0, true, true, 3, bumblebee]
        obj.classify(1.0f, true, true, 3, "bumblebee");
        // Testing with values: [1.0, true, false, 0, ]
        obj.classify(1.0f, true, false, 0, "");
        // Testing with values: [1.0, true, false, 0,  ]
        obj.classify(1.0f, true, false, 0, " ");
        // Testing with values: [1.0, true, false, 0, null]
        obj.classify(1.0f, true, false, 0, "null");
        // Testing with values: [1.0, true, false, 0, bumblebee]
        obj.classify(1.0f, true, false, 0, "bumblebee");
        // Testing with values: [1.0, true, false, 1, ]
        obj.classify(1.0f, true, false, 1, "");
        // Testing with values: [1.0, true, false, 1,  ]
        obj.classify(1.0f, true, false, 1, " ");
        // Testing with values: [1.0, true, false, 1, null]
        obj.classify(1.0f, true, false, 1, "null");
        // Testing with values: [1.0, true, false, 1, bumblebee]
        obj.classify(1.0f, true, false, 1, "bumblebee");
        // Testing with values: [1.0, true, false, -1, ]
        obj.classify(1.0f, true, false, -1, "");
        // Testing with values: [1.0, true, false, -1,  ]
        obj.classify(1.0f, true, false, -1, " ");
        // Testing with values: [1.0, true, false, -1, null]
        obj.classify(1.0f, true, false, -1, "null");
        // Testing with values: [1.0, true, false, -1, bumblebee]
        obj.classify(1.0f, true, false, -1, "bumblebee");
        // Testing with values: [1.0, true, false, 10, ]
        obj.classify(1.0f, true, false, 10, "");
        // Testing with values: [1.0, true, false, 10,  ]
        obj.classify(1.0f, true, false, 10, " ");
        // Testing with values: [1.0, true, false, 10, null]
        obj.classify(1.0f, true, false, 10, "null");
        // Testing with values: [1.0, true, false, 10, bumblebee]
        obj.classify(1.0f, true, false, 10, "bumblebee");
        // Testing with values: [1.0, true, false, 11, ]
        obj.classify(1.0f, true, false, 11, "");
        // Testing with values: [1.0, true, false, 11,  ]
        obj.classify(1.0f, true, false, 11, " ");
        // Testing with values: [1.0, true, false, 11, null]
        obj.classify(1.0f, true, false, 11, "null");
        // Testing with values: [1.0, true, false, 11, bumblebee]
        obj.classify(1.0f, true, false, 11, "bumblebee");
        // Testing with values: [1.0, true, false, 20, ]
        obj.classify(1.0f, true, false, 20, "");
        // Testing with values: [1.0, true, false, 20,  ]
        obj.classify(1.0f, true, false, 20, " ");
        // Testing with values: [1.0, true, false, 20, null]
        obj.classify(1.0f, true, false, 20, "null");
        // Testing with values: [1.0, true, false, 20, bumblebee]
        obj.classify(1.0f, true, false, 20, "bumblebee");
        // Testing with values: [1.0, true, false, 21, ]
        obj.classify(1.0f, true, false, 21, "");
        // Testing with values: [1.0, true, false, 21,  ]
        obj.classify(1.0f, true, false, 21, " ");
        // Testing with values: [1.0, true, false, 21, null]
        obj.classify(1.0f, true, false, 21, "null");
        // Testing with values: [1.0, true, false, 21, bumblebee]
        obj.classify(1.0f, true, false, 21, "bumblebee");
        // Testing with values: [1.0, true, false, 2, ]
        obj.classify(1.0f, true, false, 2, "");
        // Testing with values: [1.0, true, false, 2,  ]
        obj.classify(1.0f, true, false, 2, " ");
        // Testing with values: [1.0, true, false, 2, null]
        obj.classify(1.0f, true, false, 2, "null");
        // Testing with values: [1.0, true, false, 2, bumblebee]
        obj.classify(1.0f, true, false, 2, "bumblebee");
        // Testing with values: [1.0, true, false, 3, ]
        obj.classify(1.0f, true, false, 3, "");
        // Testing with values: [1.0, true, false, 3,  ]
        obj.classify(1.0f, true, false, 3, " ");
        // Testing with values: [1.0, true, false, 3, null]
        obj.classify(1.0f, true, false, 3, "null");
        // Testing with values: [1.0, true, false, 3, bumblebee]
        obj.classify(1.0f, true, false, 3, "bumblebee");
        // Testing with values: [1.0, false, true, 0, ]
        obj.classify(1.0f, false, true, 0, "");
        // Testing with values: [1.0, false, true, 0,  ]
        obj.classify(1.0f, false, true, 0, " ");
        // Testing with values: [1.0, false, true, 0, null]
        obj.classify(1.0f, false, true, 0, "null");
        // Testing with values: [1.0, false, true, 0, bumblebee]
        obj.classify(1.0f, false, true, 0, "bumblebee");
        // Testing with values: [1.0, false, true, 1, ]
        obj.classify(1.0f, false, true, 1, "");
        // Testing with values: [1.0, false, true, 1,  ]
        obj.classify(1.0f, false, true, 1, " ");
        // Testing with values: [1.0, false, true, 1, null]
        obj.classify(1.0f, false, true, 1, "null");
        // Testing with values: [1.0, false, true, 1, bumblebee]
        obj.classify(1.0f, false, true, 1, "bumblebee");
        // Testing with values: [1.0, false, true, -1, ]
        obj.classify(1.0f, false, true, -1, "");
        // Testing with values: [1.0, false, true, -1,  ]
        obj.classify(1.0f, false, true, -1, " ");
        // Testing with values: [1.0, false, true, -1, null]
        obj.classify(1.0f, false, true, -1, "null");
        // Testing with values: [1.0, false, true, -1, bumblebee]
        obj.classify(1.0f, false, true, -1, "bumblebee");
        // Testing with values: [1.0, false, true, 10, ]
        obj.classify(1.0f, false, true, 10, "");
        // Testing with values: [1.0, false, true, 10,  ]
        obj.classify(1.0f, false, true, 10, " ");
        // Testing with values: [1.0, false, true, 10, null]
        obj.classify(1.0f, false, true, 10, "null");
        // Testing with values: [1.0, false, true, 10, bumblebee]
        obj.classify(1.0f, false, true, 10, "bumblebee");
        // Testing with values: [1.0, false, true, 11, ]
        obj.classify(1.0f, false, true, 11, "");
        // Testing with values: [1.0, false, true, 11,  ]
        obj.classify(1.0f, false, true, 11, " ");
        // Testing with values: [1.0, false, true, 11, null]
        obj.classify(1.0f, false, true, 11, "null");
        // Testing with values: [1.0, false, true, 11, bumblebee]
        obj.classify(1.0f, false, true, 11, "bumblebee");
        // Testing with values: [1.0, false, true, 20, ]
        obj.classify(1.0f, false, true, 20, "");
        // Testing with values: [1.0, false, true, 20,  ]
        obj.classify(1.0f, false, true, 20, " ");
        // Testing with values: [1.0, false, true, 20, null]
        obj.classify(1.0f, false, true, 20, "null");
        // Testing with values: [1.0, false, true, 20, bumblebee]
        obj.classify(1.0f, false, true, 20, "bumblebee");
        // Testing with values: [1.0, false, true, 21, ]
        obj.classify(1.0f, false, true, 21, "");
        // Testing with values: [1.0, false, true, 21,  ]
        obj.classify(1.0f, false, true, 21, " ");
        // Testing with values: [1.0, false, true, 21, null]
        obj.classify(1.0f, false, true, 21, "null");
        // Testing with values: [1.0, false, true, 21, bumblebee]
        obj.classify(1.0f, false, true, 21, "bumblebee");
        // Testing with values: [1.0, false, true, 2, ]
        obj.classify(1.0f, false, true, 2, "");
        // Testing with values: [1.0, false, true, 2,  ]
        obj.classify(1.0f, false, true, 2, " ");
        // Testing with values: [1.0, false, true, 2, null]
        obj.classify(1.0f, false, true, 2, "null");
        // Testing with values: [1.0, false, true, 2, bumblebee]
        obj.classify(1.0f, false, true, 2, "bumblebee");
        // Testing with values: [1.0, false, true, 3, ]
        obj.classify(1.0f, false, true, 3, "");
        // Testing with values: [1.0, false, true, 3,  ]
        obj.classify(1.0f, false, true, 3, " ");
        // Testing with values: [1.0, false, true, 3, null]
        obj.classify(1.0f, false, true, 3, "null");
        // Testing with values: [1.0, false, true, 3, bumblebee]
        obj.classify(1.0f, false, true, 3, "bumblebee");
        // Testing with values: [1.0, false, false, 0, ]
        obj.classify(1.0f, false, false, 0, "");
        // Testing with values: [1.0, false, false, 0,  ]
        obj.classify(1.0f, false, false, 0, " ");
        // Testing with values: [1.0, false, false, 0, null]
        obj.classify(1.0f, false, false, 0, "null");
        // Testing with values: [1.0, false, false, 0, bumblebee]
        obj.classify(1.0f, false, false, 0, "bumblebee");
        // Testing with values: [1.0, false, false, 1, ]
        obj.classify(1.0f, false, false, 1, "");
        // Testing with values: [1.0, false, false, 1,  ]
        obj.classify(1.0f, false, false, 1, " ");
        // Testing with values: [1.0, false, false, 1, null]
        obj.classify(1.0f, false, false, 1, "null");
        // Testing with values: [1.0, false, false, 1, bumblebee]
        obj.classify(1.0f, false, false, 1, "bumblebee");
        // Testing with values: [1.0, false, false, -1, ]
        obj.classify(1.0f, false, false, -1, "");
        // Testing with values: [1.0, false, false, -1,  ]
        obj.classify(1.0f, false, false, -1, " ");
        // Testing with values: [1.0, false, false, -1, null]
        obj.classify(1.0f, false, false, -1, "null");
        // Testing with values: [1.0, false, false, -1, bumblebee]
        obj.classify(1.0f, false, false, -1, "bumblebee");
        // Testing with values: [1.0, false, false, 10, ]
        obj.classify(1.0f, false, false, 10, "");
        // Testing with values: [1.0, false, false, 10,  ]
        obj.classify(1.0f, false, false, 10, " ");
        // Testing with values: [1.0, false, false, 10, null]
        obj.classify(1.0f, false, false, 10, "null");
        // Testing with values: [1.0, false, false, 10, bumblebee]
        obj.classify(1.0f, false, false, 10, "bumblebee");
        // Testing with values: [1.0, false, false, 11, ]
        obj.classify(1.0f, false, false, 11, "");
        // Testing with values: [1.0, false, false, 11,  ]
        obj.classify(1.0f, false, false, 11, " ");
        // Testing with values: [1.0, false, false, 11, null]
        obj.classify(1.0f, false, false, 11, "null");
        // Testing with values: [1.0, false, false, 11, bumblebee]
        obj.classify(1.0f, false, false, 11, "bumblebee");
        // Testing with values: [1.0, false, false, 20, ]
        obj.classify(1.0f, false, false, 20, "");
        // Testing with values: [1.0, false, false, 20,  ]
        obj.classify(1.0f, false, false, 20, " ");
        // Testing with values: [1.0, false, false, 20, null]
        obj.classify(1.0f, false, false, 20, "null");
        // Testing with values: [1.0, false, false, 20, bumblebee]
        obj.classify(1.0f, false, false, 20, "bumblebee");
        // Testing with values: [1.0, false, false, 21, ]
        obj.classify(1.0f, false, false, 21, "");
        // Testing with values: [1.0, false, false, 21,  ]
        obj.classify(1.0f, false, false, 21, " ");
        // Testing with values: [1.0, false, false, 21, null]
        obj.classify(1.0f, false, false, 21, "null");
        // Testing with values: [1.0, false, false, 21, bumblebee]
        obj.classify(1.0f, false, false, 21, "bumblebee");
        // Testing with values: [1.0, false, false, 2, ]
        obj.classify(1.0f, false, false, 2, "");
        // Testing with values: [1.0, false, false, 2,  ]
        obj.classify(1.0f, false, false, 2, " ");
        // Testing with values: [1.0, false, false, 2, null]
        obj.classify(1.0f, false, false, 2, "null");
        // Testing with values: [1.0, false, false, 2, bumblebee]
        obj.classify(1.0f, false, false, 2, "bumblebee");
        // Testing with values: [1.0, false, false, 3, ]
        obj.classify(1.0f, false, false, 3, "");
        // Testing with values: [1.0, false, false, 3,  ]
        obj.classify(1.0f, false, false, 3, " ");
        // Testing with values: [1.0, false, false, 3, null]
        obj.classify(1.0f, false, false, 3, "null");
        // Testing with values: [1.0, false, false, 3, bumblebee]
        obj.classify(1.0f, false, false, 3, "bumblebee");
        // Testing with values: [-1.0, true, true, 0, ]
        obj.classify(-1.0f, true, true, 0, "");
        // Testing with values: [-1.0, true, true, 0,  ]
        obj.classify(-1.0f, true, true, 0, " ");
        // Testing with values: [-1.0, true, true, 0, null]
        obj.classify(-1.0f, true, true, 0, "null");
        // Testing with values: [-1.0, true, true, 0, bumblebee]
        obj.classify(-1.0f, true, true, 0, "bumblebee");
        // Testing with values: [-1.0, true, true, 1, ]
        obj.classify(-1.0f, true, true, 1, "");
        // Testing with values: [-1.0, true, true, 1,  ]
        obj.classify(-1.0f, true, true, 1, " ");
        // Testing with values: [-1.0, true, true, 1, null]
        obj.classify(-1.0f, true, true, 1, "null");
        // Testing with values: [-1.0, true, true, 1, bumblebee]
        obj.classify(-1.0f, true, true, 1, "bumblebee");
        // Testing with values: [-1.0, true, true, -1, ]
        obj.classify(-1.0f, true, true, -1, "");
        // Testing with values: [-1.0, true, true, -1,  ]
        obj.classify(-1.0f, true, true, -1, " ");
        // Testing with values: [-1.0, true, true, -1, null]
        obj.classify(-1.0f, true, true, -1, "null");
        // Testing with values: [-1.0, true, true, -1, bumblebee]
        obj.classify(-1.0f, true, true, -1, "bumblebee");
        // Testing with values: [-1.0, true, true, 10, ]
        obj.classify(-1.0f, true, true, 10, "");
        // Testing with values: [-1.0, true, true, 10,  ]
        obj.classify(-1.0f, true, true, 10, " ");
        // Testing with values: [-1.0, true, true, 10, null]
        obj.classify(-1.0f, true, true, 10, "null");
        // Testing with values: [-1.0, true, true, 10, bumblebee]
        obj.classify(-1.0f, true, true, 10, "bumblebee");
        // Testing with values: [-1.0, true, true, 11, ]
        obj.classify(-1.0f, true, true, 11, "");
        // Testing with values: [-1.0, true, true, 11,  ]
        obj.classify(-1.0f, true, true, 11, " ");
        // Testing with values: [-1.0, true, true, 11, null]
        obj.classify(-1.0f, true, true, 11, "null");
        // Testing with values: [-1.0, true, true, 11, bumblebee]
        obj.classify(-1.0f, true, true, 11, "bumblebee");
        // Testing with values: [-1.0, true, true, 20, ]
        obj.classify(-1.0f, true, true, 20, "");
        // Testing with values: [-1.0, true, true, 20,  ]
        obj.classify(-1.0f, true, true, 20, " ");
        // Testing with values: [-1.0, true, true, 20, null]
        obj.classify(-1.0f, true, true, 20, "null");
        // Testing with values: [-1.0, true, true, 20, bumblebee]
        obj.classify(-1.0f, true, true, 20, "bumblebee");
        // Testing with values: [-1.0, true, true, 21, ]
        obj.classify(-1.0f, true, true, 21, "");
        // Testing with values: [-1.0, true, true, 21,  ]
        obj.classify(-1.0f, true, true, 21, " ");
        // Testing with values: [-1.0, true, true, 21, null]
        obj.classify(-1.0f, true, true, 21, "null");
        // Testing with values: [-1.0, true, true, 21, bumblebee]
        obj.classify(-1.0f, true, true, 21, "bumblebee");
        // Testing with values: [-1.0, true, true, 2, ]
        obj.classify(-1.0f, true, true, 2, "");
        // Testing with values: [-1.0, true, true, 2,  ]
        obj.classify(-1.0f, true, true, 2, " ");
        // Testing with values: [-1.0, true, true, 2, null]
        obj.classify(-1.0f, true, true, 2, "null");
        // Testing with values: [-1.0, true, true, 2, bumblebee]
        obj.classify(-1.0f, true, true, 2, "bumblebee");
        // Testing with values: [-1.0, true, true, 3, ]
        obj.classify(-1.0f, true, true, 3, "");
        // Testing with values: [-1.0, true, true, 3,  ]
        obj.classify(-1.0f, true, true, 3, " ");
        // Testing with values: [-1.0, true, true, 3, null]
        obj.classify(-1.0f, true, true, 3, "null");
        // Testing with values: [-1.0, true, true, 3, bumblebee]
        obj.classify(-1.0f, true, true, 3, "bumblebee");
        // Testing with values: [-1.0, true, false, 0, ]
        obj.classify(-1.0f, true, false, 0, "");
        // Testing with values: [-1.0, true, false, 0,  ]
        obj.classify(-1.0f, true, false, 0, " ");
        // Testing with values: [-1.0, true, false, 0, null]
        obj.classify(-1.0f, true, false, 0, "null");
        // Testing with values: [-1.0, true, false, 0, bumblebee]
        obj.classify(-1.0f, true, false, 0, "bumblebee");
        // Testing with values: [-1.0, true, false, 1, ]
        obj.classify(-1.0f, true, false, 1, "");
        // Testing with values: [-1.0, true, false, 1,  ]
        obj.classify(-1.0f, true, false, 1, " ");
        // Testing with values: [-1.0, true, false, 1, null]
        obj.classify(-1.0f, true, false, 1, "null");
        // Testing with values: [-1.0, true, false, 1, bumblebee]
        obj.classify(-1.0f, true, false, 1, "bumblebee");
        // Testing with values: [-1.0, true, false, -1, ]
        obj.classify(-1.0f, true, false, -1, "");
        // Testing with values: [-1.0, true, false, -1,  ]
        obj.classify(-1.0f, true, false, -1, " ");
        // Testing with values: [-1.0, true, false, -1, null]
        obj.classify(-1.0f, true, false, -1, "null");
        // Testing with values: [-1.0, true, false, -1, bumblebee]
        obj.classify(-1.0f, true, false, -1, "bumblebee");
        // Testing with values: [-1.0, true, false, 10, ]
        obj.classify(-1.0f, true, false, 10, "");
        // Testing with values: [-1.0, true, false, 10,  ]
        obj.classify(-1.0f, true, false, 10, " ");
        // Testing with values: [-1.0, true, false, 10, null]
        obj.classify(-1.0f, true, false, 10, "null");
        // Testing with values: [-1.0, true, false, 10, bumblebee]
        obj.classify(-1.0f, true, false, 10, "bumblebee");
        // Testing with values: [-1.0, true, false, 11, ]
        obj.classify(-1.0f, true, false, 11, "");
        // Testing with values: [-1.0, true, false, 11,  ]
        obj.classify(-1.0f, true, false, 11, " ");
        // Testing with values: [-1.0, true, false, 11, null]
        obj.classify(-1.0f, true, false, 11, "null");
        // Testing with values: [-1.0, true, false, 11, bumblebee]
        obj.classify(-1.0f, true, false, 11, "bumblebee");
        // Testing with values: [-1.0, true, false, 20, ]
        obj.classify(-1.0f, true, false, 20, "");
        // Testing with values: [-1.0, true, false, 20,  ]
        obj.classify(-1.0f, true, false, 20, " ");
        // Testing with values: [-1.0, true, false, 20, null]
        obj.classify(-1.0f, true, false, 20, "null");
        // Testing with values: [-1.0, true, false, 20, bumblebee]
        obj.classify(-1.0f, true, false, 20, "bumblebee");
        // Testing with values: [-1.0, true, false, 21, ]
        obj.classify(-1.0f, true, false, 21, "");
        // Testing with values: [-1.0, true, false, 21,  ]
        obj.classify(-1.0f, true, false, 21, " ");
        // Testing with values: [-1.0, true, false, 21, null]
        obj.classify(-1.0f, true, false, 21, "null");
        // Testing with values: [-1.0, true, false, 21, bumblebee]
        obj.classify(-1.0f, true, false, 21, "bumblebee");
        // Testing with values: [-1.0, true, false, 2, ]
        obj.classify(-1.0f, true, false, 2, "");
        // Testing with values: [-1.0, true, false, 2,  ]
        obj.classify(-1.0f, true, false, 2, " ");
        // Testing with values: [-1.0, true, false, 2, null]
        obj.classify(-1.0f, true, false, 2, "null");
        // Testing with values: [-1.0, true, false, 2, bumblebee]
        obj.classify(-1.0f, true, false, 2, "bumblebee");
        // Testing with values: [-1.0, true, false, 3, ]
        obj.classify(-1.0f, true, false, 3, "");
        // Testing with values: [-1.0, true, false, 3,  ]
        obj.classify(-1.0f, true, false, 3, " ");
        // Testing with values: [-1.0, true, false, 3, null]
        obj.classify(-1.0f, true, false, 3, "null");
        // Testing with values: [-1.0, true, false, 3, bumblebee]
        obj.classify(-1.0f, true, false, 3, "bumblebee");
        // Testing with values: [-1.0, false, true, 0, ]
        obj.classify(-1.0f, false, true, 0, "");
        // Testing with values: [-1.0, false, true, 0,  ]
        obj.classify(-1.0f, false, true, 0, " ");
        // Testing with values: [-1.0, false, true, 0, null]
        obj.classify(-1.0f, false, true, 0, "null");
        // Testing with values: [-1.0, false, true, 0, bumblebee]
        obj.classify(-1.0f, false, true, 0, "bumblebee");
        // Testing with values: [-1.0, false, true, 1, ]
        obj.classify(-1.0f, false, true, 1, "");
        // Testing with values: [-1.0, false, true, 1,  ]
        obj.classify(-1.0f, false, true, 1, " ");
        // Testing with values: [-1.0, false, true, 1, null]
        obj.classify(-1.0f, false, true, 1, "null");
        // Testing with values: [-1.0, false, true, 1, bumblebee]
        obj.classify(-1.0f, false, true, 1, "bumblebee");
        // Testing with values: [-1.0, false, true, -1, ]
        obj.classify(-1.0f, false, true, -1, "");
        // Testing with values: [-1.0, false, true, -1,  ]
        obj.classify(-1.0f, false, true, -1, " ");
        // Testing with values: [-1.0, false, true, -1, null]
        obj.classify(-1.0f, false, true, -1, "null");
        // Testing with values: [-1.0, false, true, -1, bumblebee]
        obj.classify(-1.0f, false, true, -1, "bumblebee");
        // Testing with values: [-1.0, false, true, 10, ]
        obj.classify(-1.0f, false, true, 10, "");
        // Testing with values: [-1.0, false, true, 10,  ]
        obj.classify(-1.0f, false, true, 10, " ");
        // Testing with values: [-1.0, false, true, 10, null]
        obj.classify(-1.0f, false, true, 10, "null");
        // Testing with values: [-1.0, false, true, 10, bumblebee]
        obj.classify(-1.0f, false, true, 10, "bumblebee");
        // Testing with values: [-1.0, false, true, 11, ]
        obj.classify(-1.0f, false, true, 11, "");
        // Testing with values: [-1.0, false, true, 11,  ]
        obj.classify(-1.0f, false, true, 11, " ");
        // Testing with values: [-1.0, false, true, 11, null]
        obj.classify(-1.0f, false, true, 11, "null");
        // Testing with values: [-1.0, false, true, 11, bumblebee]
        obj.classify(-1.0f, false, true, 11, "bumblebee");
        // Testing with values: [-1.0, false, true, 20, ]
        obj.classify(-1.0f, false, true, 20, "");
        // Testing with values: [-1.0, false, true, 20,  ]
        obj.classify(-1.0f, false, true, 20, " ");
        // Testing with values: [-1.0, false, true, 20, null]
        obj.classify(-1.0f, false, true, 20, "null");
        // Testing with values: [-1.0, false, true, 20, bumblebee]
        obj.classify(-1.0f, false, true, 20, "bumblebee");
        // Testing with values: [-1.0, false, true, 21, ]
        obj.classify(-1.0f, false, true, 21, "");
        // Testing with values: [-1.0, false, true, 21,  ]
        obj.classify(-1.0f, false, true, 21, " ");
        // Testing with values: [-1.0, false, true, 21, null]
        obj.classify(-1.0f, false, true, 21, "null");
        // Testing with values: [-1.0, false, true, 21, bumblebee]
        obj.classify(-1.0f, false, true, 21, "bumblebee");
        // Testing with values: [-1.0, false, true, 2, ]
        obj.classify(-1.0f, false, true, 2, "");
        // Testing with values: [-1.0, false, true, 2,  ]
        obj.classify(-1.0f, false, true, 2, " ");
        // Testing with values: [-1.0, false, true, 2, null]
        obj.classify(-1.0f, false, true, 2, "null");
        // Testing with values: [-1.0, false, true, 2, bumblebee]
        obj.classify(-1.0f, false, true, 2, "bumblebee");
        // Testing with values: [-1.0, false, true, 3, ]
        obj.classify(-1.0f, false, true, 3, "");
        // Testing with values: [-1.0, false, true, 3,  ]
        obj.classify(-1.0f, false, true, 3, " ");
        // Testing with values: [-1.0, false, true, 3, null]
        obj.classify(-1.0f, false, true, 3, "null");
        // Testing with values: [-1.0, false, true, 3, bumblebee]
        obj.classify(-1.0f, false, true, 3, "bumblebee");
        // Testing with values: [-1.0, false, false, 0, ]
        obj.classify(-1.0f, false, false, 0, "");
        // Testing with values: [-1.0, false, false, 0,  ]
        obj.classify(-1.0f, false, false, 0, " ");
        // Testing with values: [-1.0, false, false, 0, null]
        obj.classify(-1.0f, false, false, 0, "null");
        // Testing with values: [-1.0, false, false, 0, bumblebee]
        obj.classify(-1.0f, false, false, 0, "bumblebee");
        // Testing with values: [-1.0, false, false, 1, ]
        obj.classify(-1.0f, false, false, 1, "");
        // Testing with values: [-1.0, false, false, 1,  ]
        obj.classify(-1.0f, false, false, 1, " ");
        // Testing with values: [-1.0, false, false, 1, null]
        obj.classify(-1.0f, false, false, 1, "null");
        // Testing with values: [-1.0, false, false, 1, bumblebee]
        obj.classify(-1.0f, false, false, 1, "bumblebee");
        // Testing with values: [-1.0, false, false, -1, ]
        obj.classify(-1.0f, false, false, -1, "");
        // Testing with values: [-1.0, false, false, -1,  ]
        obj.classify(-1.0f, false, false, -1, " ");
        // Testing with values: [-1.0, false, false, -1, null]
        obj.classify(-1.0f, false, false, -1, "null");
        // Testing with values: [-1.0, false, false, -1, bumblebee]
        obj.classify(-1.0f, false, false, -1, "bumblebee");
        // Testing with values: [-1.0, false, false, 10, ]
        obj.classify(-1.0f, false, false, 10, "");
        // Testing with values: [-1.0, false, false, 10,  ]
        obj.classify(-1.0f, false, false, 10, " ");
        // Testing with values: [-1.0, false, false, 10, null]
        obj.classify(-1.0f, false, false, 10, "null");
        // Testing with values: [-1.0, false, false, 10, bumblebee]
        obj.classify(-1.0f, false, false, 10, "bumblebee");
        // Testing with values: [-1.0, false, false, 11, ]
        obj.classify(-1.0f, false, false, 11, "");
        // Testing with values: [-1.0, false, false, 11,  ]
        obj.classify(-1.0f, false, false, 11, " ");
        // Testing with values: [-1.0, false, false, 11, null]
        obj.classify(-1.0f, false, false, 11, "null");
        // Testing with values: [-1.0, false, false, 11, bumblebee]
        obj.classify(-1.0f, false, false, 11, "bumblebee");
        // Testing with values: [-1.0, false, false, 20, ]
        obj.classify(-1.0f, false, false, 20, "");
        // Testing with values: [-1.0, false, false, 20,  ]
        obj.classify(-1.0f, false, false, 20, " ");
        // Testing with values: [-1.0, false, false, 20, null]
        obj.classify(-1.0f, false, false, 20, "null");
        // Testing with values: [-1.0, false, false, 20, bumblebee]
        obj.classify(-1.0f, false, false, 20, "bumblebee");
        // Testing with values: [-1.0, false, false, 21, ]
        obj.classify(-1.0f, false, false, 21, "");
        // Testing with values: [-1.0, false, false, 21,  ]
        obj.classify(-1.0f, false, false, 21, " ");
        // Testing with values: [-1.0, false, false, 21, null]
        obj.classify(-1.0f, false, false, 21, "null");
        // Testing with values: [-1.0, false, false, 21, bumblebee]
        obj.classify(-1.0f, false, false, 21, "bumblebee");
        // Testing with values: [-1.0, false, false, 2, ]
        obj.classify(-1.0f, false, false, 2, "");
        // Testing with values: [-1.0, false, false, 2,  ]
        obj.classify(-1.0f, false, false, 2, " ");
        // Testing with values: [-1.0, false, false, 2, null]
        obj.classify(-1.0f, false, false, 2, "null");
        // Testing with values: [-1.0, false, false, 2, bumblebee]
        obj.classify(-1.0f, false, false, 2, "bumblebee");
        // Testing with values: [-1.0, false, false, 3, ]
        obj.classify(-1.0f, false, false, 3, "");
        // Testing with values: [-1.0, false, false, 3,  ]
        obj.classify(-1.0f, false, false, 3, " ");
        // Testing with values: [-1.0, false, false, 3, null]
        obj.classify(-1.0f, false, false, 3, "null");
        // Testing with values: [-1.0, false, false, 3, bumblebee]
        obj.classify(-1.0f, false, false, 3, "bumblebee");
    }
}
