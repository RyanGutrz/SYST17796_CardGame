/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearts_ryanc;

/**
 *
 * @author ryanc
 */
public class Score {
      
  private Integer[] score = new Integer[4];

  private int roundScore() {
    for (int player = 0; player < 4; player++) {
      score[player] = 0;
    }
  }

