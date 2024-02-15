#include <iostream>
#include <cstdarg> // For handling variable arguments

// Function to compute the total score for a student
int computeTotalScore(int numQuestions, ...) {
    int totalScore = 0;
    
    va_list args;
    va_start(args, numQuestions);

    // Calculate the total score using the best three answers
    for (int i = 0; i < numQuestions; ++i) {
        int score = va_arg(args, int);
        if (i < 3) {
            totalScore += score;
        }
    }

    va_end(args);

    return totalScore;
}

int main() {
    int numQuestions;
    std::cout << "Enter the number of questions (between 3 and 5): ";
    std::cin >> numQuestions;

    if (numQuestions < 3 || numQuestions > 5) {
        std::cout << "Invalid number of questions. Please enter between 3 and 5." << std::endl;
        return 1;
    }

    int scores[5];
    for (int i = 0; i < numQuestions; ++i) {
        std::cout << "Enter score for question " << i + 1 << ": ";
        std::cin >> scores[i];
    }

    int totalScore = computeTotalScore(numQuestions, scores[0], scores[1], scores[2], scores[3], scores[4]);

    std::cout << "Total score: " << totalScore << std::endl;

    return 0;
}
