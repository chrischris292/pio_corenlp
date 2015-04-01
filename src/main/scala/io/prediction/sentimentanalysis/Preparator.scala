package io.prediction.sentimentanalysis

import io.prediction.controller.PPreparator
import org.apache.spark.SparkContext

class Preparator extends PPreparator[TrainingData, PreparedData] {

  def prepare(sc: SparkContext, trainingData: TrainingData): PreparedData = {
    PreparedData()
  }
}

