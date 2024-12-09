fun getQuadrantGraph(): Scatter {
    val quadrant = AnyChart.quadrant()

    quadrant.padding(35.0, 35.0, 35.0, 35.0)

    val data: MutableList<DataEntry> = ArrayList()
    data.add(QuadrantDataEntry(70, 70, "Bench Press")) // Push
    data.add(QuadrantDataEntry(60, 60, "Shoulder Press")) // Push
    data.add(QuadrantDataEntry(55, 15, "Pull-Ups")) // Pull
    data.add(QuadrantDataEntry(40, 45, "Barbell Row")) // Pull
    data.add(QuadrantDataEntry(35, 85, "Squats")) // Legs
    data.add(QuadrantDataEntry(70, 35, "Deadlifts")) // Legs
    data.add(QuadrantDataEntry(40, 30, "Bicep Curls")) // Arms
    data.add(QuadrantDataEntry(40, 40, "Tricep Extensions")) // Arms

    val marker: Marker = quadrant.marker(data)
    marker.labels()
        .enabled(true)
        .fontFamily("Arial")
        .fontColor("#546e7a")
    marker.labels()
        .position("right")
        .anchor(Anchor.LEFT_CENTER)
        .offsetX(5.0)
        .offsetY(0.0)
        .format("{%Name}")
    marker.tooltip(false)

    quadrant.quarters(
        """{
      rightTop: {
        title: {
          text: 'PUSH',
          fontColor: '#ff8f00',
          padding: 10
        }
      },
      rightBottom: {
        title: {
          text: 'PULL',
          fontColor: '#ff8f00',
          padding: 10
        }
      },
      leftTop: {
        title: {
          text: 'LEGS',
          fontColor: '#ff8f00',
          padding: 10
        }
      },
      leftBottom: {
        title: {
          text: 'ARMS',
          fontColor: '#ff8f00',
          padding: 10
        }
      }
    }"""
    )

    var label = quadrant.quarters().leftBottom().label(0.0)
    label.enabled(true)
    label.useHtml(true)
    label.position(Position.LEFT_BOTTOM)
    label.anchor(Anchor.LEFT_CENTER)

    label.offsetX(-20.0)
    label.text("Intensity &#8594;")
    label.rotation(-90.0)

    label = quadrant.quarters().leftBottom().label(1.0)
    label.enabled(true)
    label.useHtml(true)
    label.position(Position.LEFT_BOTTOM)
    label.anchor(Anchor.LEFT_CENTER)
    label.offsetY(20.0)
    label.text("Complexity &#8594;")

    return quadrant
}