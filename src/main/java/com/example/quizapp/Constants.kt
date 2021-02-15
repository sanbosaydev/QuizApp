package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question> ()

        val que1 = Question(1, "What country does this flag belong to?",

            R.drawable.ic_flag_of_argentina, "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1

        )
            questionList.add(que1)


        val que2 = Question(2, "What country does this flag belong to?",

            R.drawable.ic_flag_of_australia, "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2

        )
        questionList.add(que2)


        val que3 = Question(3, "What country does this flag belong to?",

            R.drawable.ic_flag_of_belgium, "Belgium",
            "Australia",
            "Armenia",
            "Austria",
            1

        )
        questionList.add(que3)



        val que4 = Question(4, "What country does this flag belong to?",

            R.drawable.ic_flag_of_brazil, "Argentina",
            "Australia",
            "Armenia",
            "Brazil",
            4

        )
        questionList.add(que4)



        val que5 = Question(5, "What country does this flag belong to?",

            R.drawable.ic_flag_of_denmark, "Argentina",
            "Australia",
            "Denmark",
            "United States",
            3

        )
        questionList.add(que5)



        val que6 = Question(6, "What country does this flag belong to?",

            R.drawable.ic_flag_of_fiji, "Fiji",
            "Australia",
            "Armenia",
            "Austria",
            1

        )
        questionList.add(que6)


        val que7 = Question(7, "What country does this flag belong to?",

            R.drawable.ic_flag_of_india, "Argentina",
            "Nigeria",
            "Armenia",
            "India",
            4

        )
        questionList.add(que7)


        val que8 = Question(8, "What country does this flag belong to?",

            R.drawable.ic_flag_of_kuwait, "Argentina",
            "Australia",
            "Kuwait",
            "Austria",
            3

        )
        questionList.add(que8)



        val que9 = Question(9, "What country does this flag belong to?",

            R.drawable.ic_flag_of_new_zealand, "Argentina",
            "Australia",
            "Armenia",
            "New Zealand",
            4

        )
        questionList.add(que9)



        val que10 = Question(1, "What country does this flag belong to?",

            R.drawable.ic_flag_of_germany, "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1

        )
        questionList.add(que10)


        return questionList

    }
}