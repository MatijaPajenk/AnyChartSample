fun getTagCloudGraph(): TagCloud {
    val tagCloud = AnyChart.tagCloud()
    tagCloud.title("Exercises")

    val ordinalColor = OrdinalColor.instantiate()
    ordinalColor.colors(
        arrayOf(
            "#26959f", "#f18126", "#3b8ad8", "#60727b", "#e24b26"
        )
    )
    tagCloud.colorScale(ordinalColor)
    tagCloud.angles(arrayOf(-90.0, 0.0, 90.0))

    tagCloud.colorRange().enabled(true)
    tagCloud.colorRange().colorLineSize(15.0)

    val data: MutableList<DataEntry> = ArrayList()
    data.add(CategoryValueDataEntry("Push-ups", "Chest", 150))
    data.add(CategoryValueDataEntry("Pull-ups", "Back", 120))
    data.add(CategoryValueDataEntry("Squats", "Legs", 300))
    data.add(CategoryValueDataEntry("Plank", "Abs", 200))
    data.add(CategoryValueDataEntry("Bicep Curls", "Arms", 140))
    data.add(CategoryValueDataEntry("Overhead Press", "Shoulders", 110))
    data.add(CategoryValueDataEntry("Deadlift", "Back", 90))
    data.add(CategoryValueDataEntry("Bench Press", "Chest", 330))
    data.add(CategoryValueDataEntry("Lunges", "Legs", 170))
    data.add(CategoryValueDataEntry("Sit-ups", "Abs", 220))
    data.add(CategoryValueDataEntry("Dumbbell Flyes", "Chest", 100))
    data.add(CategoryValueDataEntry("Tricep Dips", "Arms", 145))
    data.add(CategoryValueDataEntry("Lat Pulldowns", "Back", 95))
    data.add(CategoryValueDataEntry("Leg Press", "Legs", 160))
    data.add(CategoryValueDataEntry("Side Plank", "Abs", 180))
    data.add(CategoryValueDataEntry("Arnold Press", "Shoulders", 115))
    data.add(CategoryValueDataEntry("Hammer Curls", "Arms", 135))
    data.add(CategoryValueDataEntry("Incline Bench Press", "Chest", 125))
    data.add(CategoryValueDataEntry("Front Squats", "Legs", 155))
    data.add(CategoryValueDataEntry("Mountain Climbers", "Abs", 210))

    tagCloud.data(data)
    return tagCloud
}