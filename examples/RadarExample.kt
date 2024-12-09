fun getRadarGraph(): Radar {
    val radar = AnyChart.radar()

    radar.title("Workout Category Comparison Radar Chart")


// Configure Y-axis scale
    radar.yScale().minimum(0.0)
    radar.yScale().minimumGap(0.0)
    radar.yScale().ticks().interval(50.0)
    radar.xAxis().labels().padding(5.0, 5.0, 5.0, 5.0)

// Configure legend
    radar.legend()
        .align(Align.CENTER)
        .enabled(true)

// Create the workout data
    val data: MutableList<DataEntry> = ArrayList()
    data.add(RadarDataEntry("Push-ups", 150, 0, 0)) // Chest
    data.add(RadarDataEntry("Pull-ups", 0, 120, 0)) // Back
    data.add(RadarDataEntry("Squats", 0, 0, 180)) // Legs
    data.add(RadarDataEntry("Bench Press", 130, 0, 0)) // Chest
    data.add(RadarDataEntry("Deadlift", 0, 90, 0)) // Back
    data.add(RadarDataEntry("Lunges", 0, 0, 170)) // Legs
    data.add(RadarDataEntry("Dumbbell Flyes", 100, 0, 0)) // Chest
    data.add(RadarDataEntry("Lat Pulldowns", 0, 95, 0)) // Back
    data.add(RadarDataEntry("Front Squats", 0, 0, 155)) // Legs


// Map the data for the radar chart
    val set = com.anychart.data.Set.instantiate()
    set.data(data)
    val chestData: Mapping = set.mapAs("{ x: 'x', value: 'value' }")
    val backData: Mapping = set.mapAs("{ x: 'x', value: 'value2' }")
    val legsData: Mapping = set.mapAs("{ x: 'x', value: 'value3' }")


// Configure the lines for each category
    val chestLine: Line = radar.line(chestData)
    chestLine.name("Chest")
    chestLine.markers()
        .enabled(true)
        .type(MarkerType.CIRCLE)
        .size(3.0)

    val backLine: Line = radar.line(backData)
    backLine.name("Back")
    backLine.markers()
        .enabled(true)
        .type(MarkerType.CIRCLE)
        .size(3.0)

    val legsLine: Line = radar.line(legsData)
    legsLine.name("Legs")
    legsLine.markers()
        .enabled(true)
        .type(MarkerType.CIRCLE)
        .size(3.0)


// Configure tooltip
    radar.tooltip().format("Value: {%Value}")

    return radar
}