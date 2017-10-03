package com.hackerrank.java.code30.days;

import java.util.Scanner;

/**
 *
 * <div class="content-text challenge-text mlB" data-reactid="171"><div class=
 * "challenge_problem_statement"><div class="msB
 * challenge_problem_statement_body"><div class="hackdown-content"><style id=
 * "MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em
 * 0em; position: relative; display: block!important; text-indent: 0; max-width:
 * none; max-height: none; min-width: 0; min-height: 0; width: 100%}
 * .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG
 * .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline;
 * font-style: normal; font-weight: normal; line-height: normal; font-size:
 * 100%; font-size-adjust: none; text-indent: 0; text-align: left;
 * text-transform: none; letter-spacing: normal; word-spacing: normal;
 * word-wrap: normal; white-space: nowrap; float: none; direction: ltr;
 * max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0;
 * padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition:
 * none; -moz-transition: none; -ms-transition: none; -o-transition: none}
 * .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * <p>
 * <strong>Objective</strong> <br>
 * In this challenge, we're going to use loops to help us do some simple math.
 * Check out the <a href="/challenges/30-loops/tutorial">Tutorial</a> tab to
 * learn more.
 * </p>
 * 
 * <p>
 * <strong>Task</strong> <br>
 * Given an integer,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.395ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0
 * -576.1 600.5 721.6" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span>, print its
 * first
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149
 * 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54
 * 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152
 * 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d=
 * "M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></svg></span> multiples. Each multiple
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="5.038ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2168.9 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path><g transform=
 * "translate(822,0)"><path stroke-width="1" d="M630 29Q630 9 609 9Q604 9 587
 * 25T493 118L389 222L284 117Q178 13 175 11Q171 9 168 9Q160 9 154 15T147 29Q147
 * 36 161 51T255 146L359 250L255 354Q174 435 161 449T147 471Q147 480 153 485T168
 * 490Q173 490 175 489Q178 487 284 383L389 278L493 382Q570 459 587 475T609
 * 491Q630 491 630 471Q630 464 620 453T522 355L418 250L522 145Q606 61 618 48T630
 * 29Z"></path></g><g transform="translate(1823,0)"><path stroke-width="1" d=
 * "M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226
 * 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197
 * 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166
 * 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302
 * 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79
 * 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61
 * 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21
 * 287Z"></path></g></g></svg></span> (where
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.487ex" height="2.343ex" style="vertical-align: -0.505ex;" viewBox=
 * "0 -791.3 4515.1 1008.6" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160 563T102
 * 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302
 * 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100
 * 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><g
 * transform="translate(778,0)"><path stroke-width="1" d="M674 636Q682 636 688
 * 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694
 * 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104
 * 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694
 * -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(1834,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247
 * 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184
 * 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250
 * 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208
 * 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268
 * 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166
 * 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56
 * 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform=
 * "translate(2457,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694
 * 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694
 * 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382
 * 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694
 * -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(3514,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></g></svg></span>) should be printed on a new
 * line in the form: <code>n x i = result</code>.
 * </p>
 * </div></div></div><div class="challenge_input_format"><div class="msB
 * challenge_input_format_title">
 * <p>
 * <strong>Input Format</strong>
 * </p>
 * </div><div class="msB challenge_input_format_body"><div class=
 * "hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display
 * {text-align: center; margin: 1em 0em; position: relative; display:
 * block!important; text-indent: 0; max-width: none; max-height: none;
 * min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace
 * {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family:
 * sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight:
 * normal; line-height: normal; font-size: 100%; font-size-adjust: none;
 * text-indent: 0; text-align: left; text-transform: none; letter-spacing:
 * normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float:
 * none; direction: ltr; max-width: none; max-height: none; min-width: 0;
 * min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition:
 * none; -webkit-transition: none; -moz-transition: none; -ms-transition: none;
 * -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * <p>
 * A single integer,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.395ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0
 * -576.1 600.5 721.6" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span>.
 * </p>
 * </div></div></div><div class="challenge_constraints"><div class="msB
 * challenge_constraints_title">
 * <p>
 * <strong>Constraints</strong>
 * </p>
 * </div><div class="msB challenge_constraints_body"><div class=
 * "hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display
 * {text-align: center; margin: 1em 0em; position: relative; display:
 * block!important; text-indent: 0; max-width: none; max-height: none;
 * min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace
 * {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family:
 * sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight:
 * normal; line-height: normal; font-size: 100%; font-size-adjust: none;
 * text-indent: 0; text-align: left; text-transform: none; letter-spacing:
 * normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float:
 * none; direction: ltr; max-width: none; max-height: none; min-width: 0;
 * min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition:
 * none; -webkit-transition: none; -moz-transition: none; -ms-transition: none;
 * -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * <ul>
 * <li><span style="font-size: 100%; display: inline-block;" class="MathJax_SVG"
 * id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="11.079ex" height="2.343ex" style="vertical-align: -0.505ex;" viewBox=
 * "0 -791.3 4770.1 1008.6" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103
 * 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210
 * 201 149L142 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436
 * 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204
 * 211T233 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527
 * 309 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path><g transform=
 * "translate(778,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694
 * 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694
 * 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382
 * 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694
 * -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(1834,0)"><path stroke-width="1" d="M21 287Q22 293 24 303T36 341T56
 * 388T89 425T135 442Q171 442 195 424T225 390T231 369Q231 367 232 367L243
 * 378Q304 442 382 442Q436 442 469 415T503 336T465 179T427 52Q427 26 444 26Q450
 * 26 453 27Q482 32 505 65T540 145Q542 153 560 153Q580 153 580 145Q580 144 576
 * 130Q568 101 554 73T508 17T439 -10Q392 -10 371 17T350 73Q350 92 386 193T423
 * 345Q423 404 379 404H374Q288 404 229 303L222 291L189 157Q156 26 151 16Q138 -11
 * 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 112 180T152 343Q153 348 153 366Q153 405
 * 129 405Q91 405 66 305Q60 285 60 284Q58 278 41 278H27Q21 284 21
 * 287Z"></path></g><g transform="translate(2712,0)"><path stroke-width="1" d=
 * "M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687
 * 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83
 * 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99
 * -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84
 * -118Z"></path></g><g transform="translate(3769,0)"><path stroke-width="1" d=
 * "M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326 666 387 610T449
 * 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142 93L218 92Q375 92 385
 * 97Q392 99 409 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86
 * 81Q115 113 136 137Q145 147 170 174T204 211T233 244T261 278T284 308T305
 * 340T320 369T333 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154
 * 602T119 569T109 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154
 * 447T109 429Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297
 * 666 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250
 * -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629
 * 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16
 * 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"
 * transform="translate(500,0)"></path></g></g></svg></span></li>
 * </ul>
 * </div></div></div><div class="challenge_output_format"><div class="msB
 * challenge_output_format_title">
 * <p>
 * <strong>Output Format</strong>
 * </p>
 * </div><div class="msB challenge_output_format_body"><div class=
 * "hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display
 * {text-align: center; margin: 1em 0em; position: relative; display:
 * block!important; text-indent: 0; max-width: none; max-height: none;
 * min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace
 * {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family:
 * sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight:
 * normal; line-height: normal; font-size: 100%; font-size-adjust: none;
 * text-indent: 0; text-align: left; text-transform: none; letter-spacing:
 * normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float:
 * none; direction: ltr; max-width: none; max-height: none; min-width: 0;
 * min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition:
 * none; -webkit-transition: none; -moz-transition: none; -ms-transition: none;
 * -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * <p>
 * Print
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149
 * 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54
 * 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152
 * 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d=
 * "M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></svg></span> lines of output; each line
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="0.802ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 345.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M184 600Q184 624 203 642T247 661Q265 661 277 649T290
 * 619Q290 596 270 577T226 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54
 * 369T98 420T158 442Q197 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149
 * 61 149 51Q149 26 166 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265
 * 151T282 153Q302 153 302 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102
 * 10T74 74Q74 91 79 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124
 * 404 99 371T61 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284
 * 21 287Z"></path></g></svg></span> (where
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.487ex" height="2.343ex" style="vertical-align: -0.505ex;" viewBox=
 * "0 -791.3 4515.1 1008.6" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160 563T102
 * 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302
 * 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100
 * 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><g
 * transform="translate(778,0)"><path stroke-width="1" d="M674 636Q682 636 688
 * 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694
 * 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104
 * 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694
 * -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(1834,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247
 * 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184
 * 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250
 * 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208
 * 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268
 * 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166
 * 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56
 * 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform=
 * "translate(2457,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694
 * 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694
 * 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382
 * 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694
 * -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(3514,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></g></svg></span>) contains the
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="6.085ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2620 936.9" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99
 * 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441
 * 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366
 * 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239
 * 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76
 * 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55
 * 278 41 278H27Q21 284 21 287Z"></path><g transform="translate(451,0)"><path
 * stroke-width="1" d="M39 168Q39 225 58 272T107 350T174 402T244 433T307
 * 442H310Q355 442 388 420T421 355Q421 265 310 237Q261 224 176 223Q139 223 138
 * 221Q138 219 132 186T125 128Q125 81 146 54T209 26T302 45T394 111Q403 121 406
 * 121Q410 121 419 112T429 98T420 82T390 55T344 24T281 -1T205 -11Q126 -11 83
 * 42T39 168ZM373 353Q367 405 305 405Q272 405 244 391T199 357T170 316T154
 * 280T149 261Q149 260 169 260Q282 260 327 284T373 353Z"></path></g><g transform
 * ="translate(918,0)"><path stroke-width="1" d="M131 289Q131 321 147 354T203
 * 415T300 442Q362 442 390 415T419 355Q419 323 402 308T364 292Q351 292 340
 * 300T328 326Q328 342 337 354T354 372T367 378Q368 378 368 379Q368 382 361
 * 388T336 399T297 405Q249 405 227 379T204 326Q204 301 223 291T278 274T330
 * 259Q396 230 396 163Q396 135 385 107T352 51T289 7T195 -10Q118 -10 86 19T53
 * 87Q53 126 74 143T118 160Q133 160 146 151T160 120Q160 94 142 76T111 58Q109 57
 * 108 57T107 55Q108 52 115 47T146 34T201 27Q237 27 263 38T301 66T318 97T323
 * 122Q323 150 302 164T254 181T195 196T148 231Q131 256 131 289Z"></path></g><g
 * transform="translate(1387,0)"><path stroke-width="1" d="M21 287Q21 295 30
 * 318T55 370T99 420T158 442Q204 442 227 417T250 358Q250 340 216 246T182 105Q182
 * 62 196 45T238 27T291 44T328 78L339 95Q341 99 377 247Q407 367 413 387T427
 * 416Q444 431 463 431Q480 431 488 421T496 402L420 84Q419 79 419 68Q419 43 426
 * 35T447 26Q469 29 482 57T512 145Q514 153 532 153Q551 153 551 144Q550 139 549
 * 130T540 98T523 55T498 17T462 -8Q454 -10 438 -10Q372 -10 347 46Q345 45 336
 * 36T318 21T296 6T267 -6T233 -11Q189 -11 155 7Q103 38 103 113Q103 170 138
 * 262T173 379Q173 380 173 381Q173 390 173 393T169 400T158 404H154Q131 404 112
 * 385T82 344T65 302T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g
 * transform="translate(1960,0)"><path stroke-width="1" d="M117 59Q117 26 142
 * 26Q179 26 205 131Q211 151 215 152Q217 153 225 153H229Q238 153 241 153T246
 * 151T248 144Q247 138 245 128T234 90T214 43T183 6T137 -11Q101 -11 70 11T38
 * 85Q38 97 39 102L104 360Q167 615 167 623Q167 626 166 628T162 632T157 634T149
 * 635T141 636T132 637T122 637Q112 637 109 637T101 638T95 641T94 647Q94 649 96
 * 661Q101 680 107 682T179 688Q194 689 213 690T243 693T254 694Q266 694 266
 * 686Q266 675 193 386T118 83Q118 81 118 75T117 65V59Z"></path></g><g transform=
 * "translate(2258,0)"><path stroke-width="1" d="M26 385Q19 392 19 395Q19 399 22
 * 411T27 425Q29 430 36 430T87 431H140L159 511Q162 522 166 540T173 566T179
 * 586T187 603T197 615T211 624T229 626Q247 625 254 615T261 596Q261 589 252
 * 549T232 470L222 433Q222 431 272 431H323Q330 424 330 420Q330 398 317
 * 385H210L174 240Q135 80 135 68Q135 26 162 26Q197 26 230 60T283 144Q285 150 288
 * 151T303 153H307Q322 153 322 145Q322 142 319 133Q314 117 301 95T267 48T216
 * 6T155 -11Q125 -11 98 4T59 56Q57 64 57 83V101L92 241Q127 382 128 383Q128 385
 * 77 385H26Z"></path></g></g></svg></span> of
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="5.038ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2168.9 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path><g transform=
 * "translate(822,0)"><path stroke-width="1" d="M630 29Q630 9 609 9Q604 9 587
 * 25T493 118L389 222L284 117Q178 13 175 11Q171 9 168 9Q160 9 154 15T147 29Q147
 * 36 161 51T255 146L359 250L255 354Q174 435 161 449T147 471Q147 480 153 485T168
 * 490Q173 490 175 489Q178 487 284 383L389 278L493 382Q570 459 587 475T609
 * 491Q630 491 630 471Q630 464 620 453T522 355L418 250L522 145Q606 61 618 48T630
 * 29Z"></path></g><g transform="translate(1823,0)"><path stroke-width="1" d=
 * "M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226
 * 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197
 * 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166
 * 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302
 * 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79
 * 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61
 * 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21
 * 287Z"></path></g></g></svg></span> in the form: <br>
 * <code>n x i = result</code>.
 * </p>
 * </div></div></div><div class="challenge_sample_input"><div class="msB
 * challenge_sample_input_title">
 * <p>
 * <strong>Sample Input</strong>
 * </p>
 * </div><div class="msB challenge_sample_input_body"><div class=
 * "hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display
 * {text-align: center; margin: 1em 0em; position: relative; display:
 * block!important; text-indent: 0; max-width: none; max-height: none;
 * min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace
 * {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family:
 * sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight:
 * normal; line-height: normal; font-size: 100%; font-size-adjust: none;
 * text-indent: 0; text-align: left; text-transform: none; letter-spacing:
 * normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float:
 * none; direction: ltr; max-width: none; max-height: none; min-width: 0;
 * min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition:
 * none; -webkit-transition: none; -moz-transition: none; -ms-transition: none;
 * -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * 
 * <pre>
 * <code>2
</code>
 * </pre>
 * 
 * </div></div></div><div class="challenge_sample_output"><div class="msB
 * challenge_sample_output_title">
 * <p>
 * <strong>Sample Output</strong>
 * </p>
 * </div><div class="msB challenge_sample_output_body"><div class=
 * "hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display
 * {text-align: center; margin: 1em 0em; position: relative; display:
 * block!important; text-indent: 0; max-width: none; max-height: none;
 * min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace
 * {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family:
 * sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight:
 * normal; line-height: normal; font-size: 100%; font-size-adjust: none;
 * text-indent: 0; text-align: left; text-transform: none; letter-spacing:
 * normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float:
 * none; direction: ltr; max-width: none; max-height: none; min-width: 0;
 * min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition:
 * none; -webkit-transition: none; -moz-transition: none; -ms-transition: none;
 * -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}
 * </style><svg style="display: none;"><defs id=
 * "MathJax_SVG_glyphs"></defs></svg>
 * 
 * <pre>
 * <code>2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
</code>
 * </pre>
 * 
 * </div></div></div></div>
 *
 */

public class Day05Loops {

    public static void main(String[] args) {
	Scanner in = null;
	try {
	    in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 1; i < 11; i++) {
		System.out.println(n + " x " + i + " = " + (i * n));
	    }

	} catch (Exception e) {
	    System.err.println("@@Error " + e);
	} finally {
	    if (in != null) {
		in.close();
	    }
	}
    }
}
