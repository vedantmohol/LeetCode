<h2> 156 16
3146. Permutation Difference between Two Strings</h2><hr><div><p>You are given two strings <code>s</code> and <code>t</code> such that every character occurs at most once in <code>s</code> and <code>t</code> is a permutation of <code>s</code>.</p>

<p>The <strong>permutation difference</strong> between <code>s</code> and <code>t</code> is defined as the <strong>sum</strong> of the absolute difference between the index of the occurrence of each character in <code>s</code> and the index of the occurrence of the same character in <code>t</code>.</p>

<p>Return the <strong>permutation difference</strong> between <code>s</code> and <code>t</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abc", t = "bac"</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>For <code>s = "abc"</code> and <code>t = "bac"</code>, the permutation difference of <code>s</code> and <code>t</code> is equal to the sum of:</p>

<ul>
	<li>The absolute difference between the index of the occurrence of <code>"a"</code> in <code>s</code> and the index of the occurrence of <code>"a"</code> in <code>t</code>.</li>
	<li>The absolute difference between the index of the occurrence of <code>"b"</code> in <code>s</code> and the index of the occurrence of <code>"b"</code> in <code>t</code>.</li>
	<li>The absolute difference between the index of the occurrence of <code>"c"</code> in <code>s</code> and the index of the occurrence of <code>"c"</code> in <code>t</code>.</li>
</ul>

<p>That is, the permutation difference between <code>s</code> and <code>t</code> is equal to <code>|0 - 1| + |1 - 0| + |2 - 2| = 2</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abcde", t = "edbac"</span></p>

<p><strong>Output:</strong> <span class="example-io">12</span></p>

<p><strong>Explanation:</strong> The permutation difference between <code>s</code> and <code>t</code> is equal to <code>|0 - 3| + |1 - 2| + |2 - 4| + |3 - 1| + |4 - 0| = 12</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 26</code></li>
	<li>Each character occurs at most once in <code>s</code>.</li>
	<li><code>t</code> is a permutation of <code>s</code>.</li>
	<li><code>s</code> consists only of lowercase English letters.</li>
</ul>
</div>