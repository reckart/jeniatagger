package com.jmcejuela.bio.jenia.maxent;

import java.util.ArrayList;

/**
 * From maxent.h
 */
public class ME_Sample {
  public String label;
  public final ArrayList<String> features;

  public ME_Sample() {
    this("");
  }

  public ME_Sample(String l) {
    label = l;
    features = new ArrayList<String>();
  }

  // jenia: not deprecated by genia but never used it
  // void set_label(const std::string & l) { label = l; }

  // to add a binary feature
  public void add_feature(String f) {
    features.add(f);
  }

  // // obsolete
  // void add_feature(const std::pair<std::string, double> & f) {
  // rvfeatures.push_back(f); // real-valued features
  // }
}

/**
 * Never used.
 */
// //
// //for those who want to use load_from_array()
// //
// typedef struct ME_Model_Data
// {
// char * label;
// char * feature;
// double weight;
// } ME_Model_Data;

