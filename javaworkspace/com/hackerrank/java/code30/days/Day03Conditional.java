package com.hackerrank.java.code30.days;

import java.util.Scanner;

/**
 *
 * <div class="span-sm-11 hr_tour-problem-statement problem-statement
 * have-external-links"><div class="content-text challenge-text mlB"><div class=
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
 * In this challenge, we're getting started with conditional statements. Check
 * out the <a href="/challenges/30-conditional-statements/tutorial">Tutorial</a>
 * tab for learning materials and an instructional video!
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span>, perform the
 * following conditional actions:
 * </p>
 * 
 * <ul>
 * <li>If
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is odd,
 * print <code>Weird</code></li>
 * <li>If
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is even and
 * in the inclusive range of
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span> to
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M164 157Q164 133 148 117T109 101H102Q148 22 224 22Q294 22
 * 326 82Q345 115 345 210Q345 313 318 349Q292 382 260 382H254Q176 382 136
 * 314Q132 307 129 306T114 304Q97 304 95 310Q93 314 93 485V614Q93 664 98 664Q100
 * 666 102 666Q103 666 123 658T178 642T253 634Q324 634 389 662Q397 666 402
 * 666Q410 666 410 648V635Q328 538 205 538Q174 538 149 544L139 546V374Q158 388
 * 169 396T205 412T256 420Q337 420 393 355T449 201Q449 109 385 44T229 -22Q148
 * -22 99 32T50 154Q50 178 61 192T84 210T107 214Q132 214 148 197T164
 * 157Z"></path></g></svg></span>, print <code>Not Weird</code></li>
 * <li>If
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-6-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is even and
 * in the inclusive range of
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-7-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432
 * 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623
 * 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263
 * 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169
 * 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257
 * 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251
 * 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257
 * 397Z"></path></g></svg></span> to
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-8-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path><path stroke-width="1" d="M96
 * 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></svg></span>, print <code>Weird</code></li>
 * <li>If
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-9-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is even and
 * greater than
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-10-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path><path stroke-width="1" d="M96
 * 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></svg></span>, print
 * <code>Not Weird</code></li>
 * </ul>
 * 
 * <p>
 * Complete the stub code provided in your editor to print whether or not
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-11-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is weird.
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
 * A single line containing a positive integer,
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
 * width="12.241ex" height="2.343ex" style="vertical-align: -0.505ex;" viewBox=
 * "0 -791.3 5270.6 1008.6" role="img" focusable="false"><g stroke=
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
 * "M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245
 * 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339
 * 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177
 * 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d="M96
 * 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M96 585Q152 666 249
 * 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301
 * -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321
 * 597Q291 629 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145
 * 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354
 * 524T321 597Z" transform="translate(1001,0)"></path></g></g></svg></span></li>
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
 * Print <code>Weird</code> if the number is weird; otherwise, print
 * <code>Not Weird</code>.
 * </p>
 * 
 * <p>
 * <strong>Sample Input 0</strong>
 * </p>
 * 
 * <pre>
 * <code>3
</code>
 * </pre>
 * 
 * <p>
 * <strong>Sample Output 0</strong>
 * </p>
 * 
 * <pre>
 * <code>Weird
</code>
 * </pre>
 * 
 * <p>
 * <strong>Sample Input 1</strong>
 * </p>
 * 
 * <pre>
 * <code>24
</code>
 * </pre>
 * 
 * <p>
 * <strong>Sample Output 1</strong>
 * </p>
 * 
 * <pre>
 * <code>Not Weird
</code>
 * </pre>
 * 
 * </div></div></div><div class="challenge_explanation"><div class="msB
 * challenge_explanation_title">
 * <p>
 * <strong>Explanation</strong>
 * </p>
 * </div><div class="msB challenge_explanation_body"><div class=
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
 * <em>Sample Case 0:</em>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="5.656ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2435.1 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path><g transform=
 * "translate(878,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(1934,0)"><path stroke-width="1" d="M127 463Q100 463 85
 * 480T69 524Q69 579 117 622T233 665Q268 665 277 664Q351 652 390 611T430 522Q430
 * 470 396 421T302 350L299 348Q299 347 308 345T337 336T375 315Q457 262 457
 * 175Q457 96 395 37T238 -22Q158 -22 100 21T42 130Q42 158 60 175T105 193Q133 193
 * 151 175T169 130Q169 119 166 110T159 94T148 82T136 74T126 70T118 67L114 66Q165
 * 21 238 21Q293 21 321 74Q338 107 338 175V195Q338 290 274 322Q259 328 213
 * 329L171 330L168 332Q166 335 166 348Q166 366 174 366Q202 366 232 371Q266 376
 * 294 413T322 525V533Q322 590 287 612Q265 626 240 626Q208 626 181 615T143
 * 592T132 580H135Q138 579 143 578T153 573T165 566T175 555T183 540T186 520Q186
 * 498 172 481T127 463Z"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is odd and
 * odd numbers are weird, so we print <code>Weird</code>.
 * </p>
 * 
 * <p>
 * <em>Sample Case 1:</em>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="6.818ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2935.6 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path><g transform=
 * "translate(878,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(1934,0)"><path stroke-width="1" d="M109 429Q82 429 66
 * 447T50 491Q50 562 103 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381
 * 315T301 241Q265 210 201 149L142 93L218 92Q375 92 385 97Q392 99 409
 * 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136
 * 137Q145 147 170 174T204 211T233 244T261 278T284 308T305 340T320 369T333
 * 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154 602T119 569T109
 * 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154 447T109
 * 429Z"></path><path stroke-width="1" d="M462 0Q444 3 333 3Q217 3 199
 * 0H190V46H221Q241 46 248 46T265 48T279 53T286 61Q287 63 287 115V165H28V211L179
 * 442Q332 674 334 675Q336 677 355 677H373L379 671V211H471V165H379V114Q379 73
 * 379 66T385 54Q393 47 442 46H471V0H462ZM293 211V545L74 212L183 211H293Z"
 * transform="translate(500,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="6.818ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2935.6 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M21 287Q22 293 24 303T36 341T56 388T89 425T135 442Q171
 * 442 195 424T225 390T231 369Q231 367 232 367L243 378Q304 442 382 442Q436 442
 * 469 415T503 336T465 179T427 52Q427 26 444 26Q450 26 453 27Q482 32 505 65T540
 * 145Q542 153 560 153Q580 153 580 145Q580 144 576 130Q568 101 554 73T508 17T439
 * -10Q392 -10 371 17T350 73Q350 92 386 193T423 345Q423 404 379 404H374Q288 404
 * 229 303L222 291L189 157Q156 26 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74
 * 17Q74 30 112 180T152 343Q153 348 153 366Q153 405 129 405Q91 405 66 305Q60 285
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path><g transform=
 * "translate(878,0)"><path stroke-width="1" d="M84 520Q84 528 88 533T96 539L99
 * 540Q106 540 253 471T544 334L687 265Q694 260 694 250T687 235Q685 233 395
 * 96L107 -40H101Q83 -38 83 -20Q83 -19 83 -17Q82 -10 98 -1Q117 9 248 71Q326 108
 * 378 132L626 250L378 368Q90 504 86 509Q84 513 84 520Z"></path></g><g transform
 * ="translate(1934,0)"><path stroke-width="1" d="M109 429Q82 429 66 447T50
 * 491Q50 562 103 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381
 * 315T301 241Q265 210 201 149L142 93L218 92Q375 92 385 97Q392 99 409
 * 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136
 * 137Q145 147 170 174T204 211T233 244T261 278T284 308T305 340T320 369T333
 * 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154 602T119 569T109
 * 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154 447T109
 * 429Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></g></svg></span> and
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 60 284Q58 278 41 278H27Q21 284 21 287Z"></path></g></svg></span> is even, so
 * it isn't weird. Thus, we print <code>Not Weird</code>.
 * </p>
 * </div></div></div></div></div>
 *
 */
public class Day03Conditional {

    public static void main(String[] args) {
	Scanner scan = null;

	try {
	    scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    scan.close();
	    String ans = "";

	    // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	    if (n % 2 == 1) {
		ans = "Weird";
	    } else {
		// Complete the code
		if ((n >= 2 && n <= 5) || (n > 20)) {
		    ans = "Not Weird";
		} else {
		    ans = "Weird";
		}
	    }
	    System.out.println(ans);
	} catch (Exception e) {
	    System.err.println("@@Error caused due to " + e);
	} finally {
	    if (scan != null)
		scan.close();
	}
    }
}
