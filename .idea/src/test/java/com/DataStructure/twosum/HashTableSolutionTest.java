package com.DataStructure.twosum;

import org.junit.gen5.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HashTableSolutionTest {
    @Test
    void test_correct_indices() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    void test_correct_indices_2() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    void test_correct_indices_3() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void test_array_length_2() {

        HashTableSolution solution = new HashTableSolution();
        int[] nums = {2, 7};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result);
//        Assertions.assertEquals(Arrays.stream(expected).toArray(), Arrays.stream(result).toArray());
    }
    @Test
    public void test_empty_array() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {};
        int target = 9;
        int[] expected = null;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void test_single_element_array() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {2};
        int target = 9;
        int[] expected = null;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void test_no_sum_elements_array_length_2() {
        HashTableSolution solution = new HashTableSolution();
        int[] nums = {2, 7};
        int target = 10;
        int[] expected = null;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(expected, result);
    }

}