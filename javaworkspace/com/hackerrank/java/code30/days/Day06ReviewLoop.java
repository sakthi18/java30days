package com.hackerrank.java.code30.days;

import java.util.Scanner;

/**
 *
 * <div class="span-sm-11 hr_tour-problem-statement problem-statement
 * have-external-links" data-reactid="170"><div class="content-text
 * challenge-text mlB" data-reactid="171"><div class=
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
 * Today we're expanding our knowledge of Strings and combining it with what
 * we've already learned about loops. Check out the
 * <a href="/challenges/30-review-loop/tutorial">Tutorial</a> tab for learning
 * materials and an instructional video!
 * </p>
 * 
 * <p>
 * <strong>Task</strong> <br>
 * Given a string,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>,
 * of length
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.064ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 888.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M234 637Q231 637 226 637Q201 637 196 638T191 649Q191 676
 * 202 682Q204 683 299 683Q376 683 387 683T401 677Q612 181 616 168L670 381Q723
 * 592 723 606Q723 633 659 637Q635 637 635 648Q635 650 637 660Q641 676 643
 * 679T653 683Q656 683 684 682T767 680Q817 680 843 681T873 682Q888 682 888
 * 672Q888 650 880 642Q878 637 858 637Q787 633 769 597L620 7Q618 0 599 0Q585 0
 * 582 2Q579 5 453 305L326 604L261 344Q196 88 196 79Q201 46 268 46H278Q284 41
 * 284 38T282 19Q278 6 272 0H259Q228 2 151 2Q123 2 100 2T63 2T46 1Q31 1 31 10Q31
 * 14 34 26T39 40Q41 46 62 46Q130 49 150 85Q154 91 221 362L289 634Q287 635 234
 * 637Z"></path></g></svg></span> that is indexed from
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465
 * 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137
 * 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178
 * 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318
 * 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path></g></svg></span>
 * to
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="6.066ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 2611.9 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M234 637Q231 637 226 637Q201 637 196 638T191 649Q191 676
 * 202 682Q204 683 299 683Q376 683 387 683T401 677Q612 181 616 168L670 381Q723
 * 592 723 606Q723 633 659 637Q635 637 635 648Q635 650 637 660Q641 676 643
 * 679T653 683Q656 683 684 682T767 680Q817 680 843 681T873 682Q888 682 888
 * 672Q888 650 880 642Q878 637 858 637Q787 633 769 597L620 7Q618 0 599 0Q585 0
 * 582 2Q579 5 453 305L326 604L261 344Q196 88 196 79Q201 46 268 46H278Q284 41
 * 284 38T282 19Q278 6 272 0H259Q228 2 151 2Q123 2 100 2T63 2T46 1Q31 1 31 10Q31
 * 14 34 26T39 40Q41 46 62 46Q130 49 150 85Q154 91 221 362L289 634Q287 635 234
 * 637Z"></path><g transform="translate(1110,0)"><path stroke-width="1" d="M84
 * 237T84 250T98 270H679Q694 262 694 250T679 230H98Q84 237 84
 * 250Z"></path></g><g transform="translate(2111,0)"><path stroke-width="1" d=
 * "M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245
 * 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339
 * 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177
 * 47T193 50T201 52T207 57T213 61V578Z"></path></g></g></svg></span>, print its
 * <em>even-indexed</em> and <em>odd-indexed</em> characters as
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span>
 * space-separated strings on a single line (see the <em>Sample</em> below for
 * more detail).
 * </p>
 * 
 * <p>
 * <strong>Note:</strong>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-6-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465
 * 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137
 * 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178
 * 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318
 * 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path></g></svg></span>
 * is considered to be an <em>even</em> index.
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
 * The first line contains an integer,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.636ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 704.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M40 437Q21 437 21 445Q21 450 37 501T71 602L88 651Q93 669
 * 101 677H569H659Q691 677 697 676T704 667Q704 661 687 553T668 444Q668 437 649
 * 437Q640 437 637 437T631 442L629 445Q629 451 635 490T641 551Q641 586 628
 * 604T573 629Q568 630 515 631Q469 631 457 630T439 622Q438 621 368 343T298
 * 60Q298 48 386 46Q418 46 427 45T436 36Q436 31 433 22Q429 4 424 1L422 0Q419 0
 * 415 0Q410 0 363 1T228 2Q99 2 64 0H49Q43 6 43 9T45 27Q49 40 55 46H83H94Q174 46
 * 189 55Q190 56 191 56Q196 59 201 76T241 233Q258 301 269 344Q339 619 339
 * 625Q339 630 310 630H279Q212 630 191 624Q146 614 121 583T67 467Q60 445 57
 * 441T43 437H40Z"></path></g></svg></span> (the number of test cases). <br>
 * Each line
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
 * 21 287Z"></path></g></svg></span> of the
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.636ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 704.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M40 437Q21 437 21 445Q21 450 37 501T71 602L88 651Q93 669
 * 101 677H569H659Q691 677 697 676T704 667Q704 661 687 553T668 444Q668 437 649
 * 437Q640 437 637 437T631 442L629 445Q629 451 635 490T641 551Q641 586 628
 * 604T573 629Q568 630 515 631Q469 631 457 630T439 622Q438 621 368 343T298
 * 60Q298 48 386 46Q418 46 427 45T436 36Q436 31 433 22Q429 4 424 1L422 0Q419 0
 * 415 0Q410 0 363 1T228 2Q99 2 64 0H49Q43 6 43 9T45 27Q49 40 55 46H83H94Q174 46
 * 189 55Q190 56 191 56Q196 59 201 76T241 233Q258 301 269 344Q339 619 339
 * 625Q339 630 310 630H279Q212 630 191 624Q146 614 121 583T67 467Q60 445 57
 * 441T43 437H40Z"></path></g></svg></span> subsequent lines contain a String,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>.
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
 * width="11.321ex" height="2.343ex" style="vertical-align: -0.505ex;" viewBox=
 * "0 -791.3 4874.1 1008.6" role="img" focusable="false"><g stroke=
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
 * "translate(1834,0)"><path stroke-width="1" d="M40 437Q21 437 21 445Q21 450 37
 * 501T71 602L88 651Q93 669 101 677H569H659Q691 677 697 676T704 667Q704 661 687
 * 553T668 444Q668 437 649 437Q640 437 637 437T631 442L629 445Q629 451 635
 * 490T641 551Q641 586 628 604T573 629Q568 630 515 631Q469 631 457 630T439
 * 622Q438 621 368 343T298 60Q298 48 386 46Q418 46 427 45T436 36Q436 31 433
 * 22Q429 4 424 1L422 0Q419 0 415 0Q410 0 363 1T228 2Q99 2 64 0H49Q43 6 43 9T45
 * 27Q49 40 55 46H83H94Q174 46 189 55Q190 56 191 56Q196 59 201 76T241 233Q258
 * 301 269 344Q339 619 339 625Q339 630 310 630H279Q212 630 191 624Q146 614 121
 * 583T67 467Q60 445 57 441T43 437H40Z"></path></g><g transform=
 * "translate(2816,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694
 * 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694
 * 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382
 * 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694
 * -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(3873,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path></g></g></svg></span></li>
 * <li><span style="font-size: 100%; display: inline-block;" class="MathJax_SVG"
 * id="MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="24.038ex" height="2.509ex" style="vertical-align: -0.671ex;" viewBox=
 * "0 -791.3 10349.6 1080.4" role="img" focusable="false"><g stroke=
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
 * "translate(1834,0)"><path stroke-width="1" d="M42 46H56Q95 46 103 60V68Q103
 * 77 103 91T103 124T104 167T104 217T104 272T104 329Q104 366 104 407T104 482T104
 * 542T103 586T103 603Q100 622 89 628T44 637H26V660Q26 683 28 683L38 684Q48 685
 * 67 686T104 688Q121 689 141 690T171 693T182 694H185V379Q185 62 186 60Q190 52
 * 198 49Q219 46 247 46H263V0H255L232 1Q209 2 183 2T145 3T107 3T57 1L34
 * 0H26V46H42Z"></path><path stroke-width="1" d="M28 218Q28 273 48 318T98
 * 391T163 433T229 448Q282 448 320 430T378 380T406 316T415 245Q415 238 408
 * 231H126V216Q126 68 226 36Q246 30 270 30Q312 30 342 62Q359 79 369 104L379
 * 128Q382 131 395 131H398Q415 131 415 121Q415 117 412 108Q393 53 349 21T250
 * -11Q155 -11 92 58T28 218ZM333 275Q322 403 238 411H236Q228 411 220 410T195
 * 402T166 381T143 340T127 274V267H333V275Z" transform=
 * "translate(278,0)"></path><path stroke-width="1" d="M41 46H55Q94 46 102
 * 60V68Q102 77 102 91T102 122T103 161T103 203Q103 234 103 269T102 328V351Q99
 * 370 88 376T43 385H25V408Q25 431 27 431L37 432Q47 433 65 434T102 436Q119 437
 * 138 438T167 441T178 442H181V402Q181 364 182 364T187 369T199 384T218 402T247
 * 421T285 437Q305 442 336 442Q450 438 463 329Q464 322 464 190V104Q464 66 466
 * 59T477 49Q498 46 526 46H542V0H534L510 1Q487 2 460 2T422 3Q319 3 310
 * 0H302V46H318Q379 46 379 62Q380 64 380 200Q379 335 378 343Q372 371 358 385T334
 * 402T308 404Q263 404 229 370Q202 343 195 315T187 232V168V108Q187 78 188 68T191
 * 55T200 49Q221 46 249 46H265V0H257L234 1Q210 2 183 2T145 3Q42 3 33
 * 0H25V46H41Z" transform="translate(723,0)"></path><path stroke-width="1" d=
 * "M329 409Q373 453 429 453Q459 453 472 434T485 396Q485 382 476 371T449 360Q416
 * 360 412 390Q410 404 415 411Q415 412 416 414V415Q388 412 363 393Q355 388 355
 * 386Q355 385 359 381T368 369T379 351T388 325T392 292Q392 230 343 187T222
 * 143Q172 143 123 171Q112 153 112 133Q112 98 138 81Q147 75 155 75T227 73Q311 72
 * 335 67Q396 58 431 26Q470 -13 470 -72Q470 -139 392 -175Q332 -206 250 -206Q167
 * -206 107 -175Q29 -140 29 -75Q29 -39 50 -15T92 18L103 24Q67 55 67 108Q67 155
 * 96 193Q52 237 52 292Q52 355 102 398T223 442Q274 442 318 416L329 409ZM299
 * 343Q294 371 273 387T221 404Q192 404 171 388T145 343Q142 326 142 292Q142 248
 * 149 227T179 192Q196 182 222 182Q244 182 260 189T283 207T294 227T299 242Q302
 * 258 302 292T299 343ZM403 -75Q403 -50 389 -34T348 -11T299 -2T245 0H218Q151 0
 * 138 -6Q118 -15 107 -34T95 -74Q95 -84 101 -97T122 -127T170 -155T250 -167Q319
 * -167 361 -139T403 -75Z" transform="translate(1279,0)"></path><path
 * stroke-width="1" d="M27 422Q80 426 109 478T141
 * 600V615H181V431H316V385H181V241Q182 116 182 100T189 68Q203 29 238 29Q282 29
 * 292 100Q293 108 293 146V181H333V146V134Q333 57 291 17Q264 -10 221 -10Q187 -10
 * 162 2T124 33T105 68T98 100Q97 107 97 248V385H18V422H27Z" transform=
 * "translate(1780,0)"></path><path stroke-width="1" d="M41 46H55Q94 46 102
 * 60V68Q102 77 102 91T102 124T102 167T103 217T103 272T103 329Q103 366 103
 * 407T103 482T102 542T102 586T102 603Q99 622 88 628T43 637H25V660Q25 683 27
 * 683L37 684Q47 685 66 686T103 688Q120 689 140 690T170 693T181 694H184V367Q244
 * 442 328 442Q451 442 463 329Q464 322 464 190V104Q464 66 466 59T477 49Q498 46
 * 526 46H542V0H534L510 1Q487 2 460 2T422 3Q319 3 310 0H302V46H318Q379 46 379
 * 62Q380 64 380 200Q379 335 378 343Q372 371 358 385T334 402T308 404Q263 404 229
 * 370Q202 343 195 315T187 232V168V108Q187 78 188 68T191 55T200 49Q221 46 249
 * 46H265V0H257L234 1Q210 2 183 2T145 3Q42 3 33 0H25V46H41Z" transform=
 * "translate(2169,0)"></path><path stroke-width="1" d="M28 214Q28 309 93
 * 378T250 448Q340 448 405 380T471 215Q471 120 407 55T250 -10Q153 -10 91 57T28
 * 214ZM250 30Q372 30 372 193V225V250Q372 272 371 288T364 326T348 362T317
 * 390T268 410Q263 411 252 411Q222 411 195 399Q152 377 139 338T126 246V226Q126
 * 130 145 91Q177 30 250 30Z" transform="translate(2976,0)"></path><path
 * stroke-width="1" d="M273 0Q255 3 146 3Q43 3 34 0H26V46H42Q70 46 91 49Q99 52
 * 103 60Q104 62 104 224V385H33V431H104V497L105 564L107 574Q126 639 171 668T266
 * 704Q267 704 275 704T289 705Q330 702 351 679T372 627Q372 604 358 590T321
 * 576T284 590T270 627Q270 647 288 667H284Q280 668 273 668Q245 668 223 647T189
 * 592Q183 572 182 497V431H293V385H185V225Q185 63 186 61T189 57T194 54T199
 * 51T206 49T213 48T222 47T231 47T241 46T251 46H282V0H273Z" transform=
 * "translate(3476,0)"></path></g><g transform="translate(5867,0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g><g transform=
 * "translate(6790,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694
 * 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694
 * 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382
 * 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694
 * -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(7847,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M96 585Q152 666 249
 * 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301
 * -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321
 * 597Q291 629 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145
 * 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354
 * 524T321 597Z" transform="translate(1001,0)"></path><path stroke-width="1" d=
 * "M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417
 * 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39
 * 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145
 * 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354
 * 130T362 333Q362 478 354 524T321 597Z" transform=
 * "translate(1501,0)"></path><path stroke-width="1" d="M96 585Q152 666 249
 * 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301
 * -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321
 * 597Q291 629 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145
 * 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354
 * 524T321 597Z" transform="translate(2002,0)"></path></g></g></svg></span></li>
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
 * For each String
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.335ex" height="2.843ex" style="vertical-align: -1.005ex;" viewBox="0
 * -791.3 1005.2 1223.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(613,-150)"><path stroke-width="1" transform="scale(0.707)" d="M297
 * 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340
 * 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185
 * 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126
 * 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354
 * 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7
 * -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69
 * -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278
 * 308T289 365Q289 372 288 376Z"></path></g></g></svg></span> (where
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="13.957ex" height="2.509ex" style="vertical-align: -0.671ex;" viewBox=
 * "0 -791.3 6009.1 1080.4" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345
 * 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224
 * -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250
 * 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250
 * 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path><g
 * transform="translate(778,0)"><path stroke-width="1" d="M674 636Q682 636 688
 * 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694
 * 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104
 * 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694
 * -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform=
 * "translate(1834,0)"><path stroke-width="1" d="M297 596Q297 627 318 644T361
 * 661Q378 661 389 651T403 623Q403 595 384 576T340 557Q322 557 310 567T297
 * 596ZM288 376Q288 405 262 405Q240 405 220 393T185 362T161 325T144 293L137
 * 279Q135 278 121 278H107Q101 284 101 286T105 299Q126 348 164 391T252 441Q253
 * 441 260 441T272 442Q296 441 316 432Q341 418 354 401T367 348V332L318 133Q267
 * -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7 -183T-12 -137Q-12 -110 7
 * -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69 -168 77 -168Q111 -168 139
 * -140T182 -74L193 -32Q204 11 219 72T251 197T278 308T289 365Q289 372 288
 * 376Z"></path></g><g transform="translate(2524,0)"><path stroke-width="1" d=
 * "M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687
 * 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83
 * 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99
 * -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84
 * -118Z"></path></g><g transform="translate(3581,0)"><path stroke-width="1" d=
 * "M40 437Q21 437 21 445Q21 450 37 501T71 602L88 651Q93 669 101 677H569H659Q691
 * 677 697 676T704 667Q704 661 687 553T668 444Q668 437 649 437Q640 437 637
 * 437T631 442L629 445Q629 451 635 490T641 551Q641 586 628 604T573 629Q568 630
 * 515 631Q469 631 457 630T439 622Q438 621 368 343T298 60Q298 48 386 46Q418 46
 * 427 45T436 36Q436 31 433 22Q429 4 424 1L422 0Q419 0 415 0Q410 0 363 1T228
 * 2Q99 2 64 0H49Q43 6 43 9T45 27Q49 40 55 46H83H94Q174 46 189 55Q190 56 191
 * 56Q196 59 201 76T241 233Q258 301 269 344Q339 619 339 625Q339 630 310
 * 630H279Q212 630 191 624Q146 614 121 583T67 467Q60 445 57 441T43
 * 437H40Z"></path></g><g transform="translate(4507,0)"><path stroke-width="1" d
 * ="M84 237T84 250T98 270H679Q694 262 694 250T679 230H98Q84 237 84
 * 250Z"></path></g><g transform="translate(5508,0)"><path stroke-width="1" d=
 * "M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245
 * 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339
 * 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177
 * 47T193 50T201 52T207 57T213 61V578Z"></path></g></g></svg></span>), print
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.335ex" height="2.843ex" style="vertical-align: -1.005ex;" viewBox="0
 * -791.3 1005.2 1223.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(613,-150)"><path stroke-width="1" transform="scale(0.707)" d="M297
 * 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340
 * 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185
 * 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126
 * 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354
 * 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7
 * -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69
 * -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278
 * 308T289 365Q289 372 288 376Z"></path></g></g></svg></span>'s
 * <em>even-indexed</em> characters, followed by a space, followed by
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.335ex" height="2.843ex" style="vertical-align: -1.005ex;" viewBox="0
 * -791.3 1005.2 1223.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(613,-150)"><path stroke-width="1" transform="scale(0.707)" d="M297
 * 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340
 * 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185
 * 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126
 * 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354
 * 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7
 * -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69
 * -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278
 * 308T289 365Q289 372 288 376Z"></path></g></g></svg></span>'s
 * <em>odd-indexed</em> characters.
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
Hacker
Rank
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
 * <code>Hce akr
Rn ak
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
 * <em>Test Case 0</em>:
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="14.032ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox=
 * "0 -791.3 6041.6 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(923,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(1979,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M128 622Q121 629 117
 * 631T101 634T58 637H25V683H36Q57 680 180 680Q315 680 324 683H335V637H302Q262
 * 636 251 634T233 622L232 500V378H517V622Q510 629 506 631T490 634T447
 * 637H414V683H425Q446 680 569 680Q704 680 713 683H724V637H691Q651 636 640
 * 634T622 622V61Q628 51 639 49T691 46H724V0H713Q692 3 569 3Q434 3 425
 * 0H414V46H447Q489 47 498 49T517 61V332H232V197L233 61Q239 51 250 49T302
 * 46H335V0H324Q303 3 180 3Q45 3 36 0H25V46H58Q100 47 109 49T128 61V622Z"
 * transform="translate(500,0)"></path><path stroke-width="1" d="M137 305T115
 * 305T78 320T63 359Q63 394 97 421T218 448Q291 448 336 416T396 340Q401 326 401
 * 309T402 194V124Q402 76 407 58T428 40Q443 40 448 56T453 109V145H493V106Q492 66
 * 490 59Q481 29 455 12T400 -6T353 12T329 54V58L327 55Q325 52 322 49T314 40T302
 * 29T287 17T269 6T247 -2T221 -8T190 -11Q130 -11 82 20T34 107Q34 128 41 147T68
 * 188T116 225T194 253T304 268H318V290Q318 324 312 340Q290 411 215 411Q197 411
 * 181 410T156 406T148 403Q170 388 170 359Q170 334 154 320ZM126 106Q126 75 150
 * 51T209 26Q247 26 276 49T315 109Q317 116 318 175Q318 233 317 233Q309 233 296
 * 232T251 223T193 203T147 166T126 106Z" transform=
 * "translate(1251,0)"></path><path stroke-width="1" d="M370 305T349 305T313
 * 320T297 358Q297 381 312 396Q317 401 317 402T307 404Q281 408 258 408Q209 408
 * 178 376Q131 329 131 219Q131 137 162 90Q203 29 272 29Q313 29 338 55T374
 * 117Q376 125 379 127T395 129H409Q415 123 415 120Q415 116 411 104T395 71T366
 * 33T318 2T249 -11Q163 -11 99 53T34 214Q34 318 99 383T250 448T370 421T404
 * 357Q404 334 387 320Z" transform="translate(1751,0)"></path><path stroke-width
 * ="1" d="M36 46H50Q89 46 97 60V68Q97 77 97 91T97 124T98 167T98 217T98 272T98
 * 329Q98 366 98 407T98 482T98 542T97 586T97 603Q94 622 83 628T38 637H20V660Q20
 * 683 22 683L32 684Q42 685 61 686T98 688Q115 689 135 690T165 693T176
 * 694H179V463L180 233L240 287Q300 341 304 347Q310 356 310 364Q310 383 289
 * 385H284V431H293Q308 428 412 428Q475 428 484 431H489V385H476Q407 380 360
 * 341Q286 278 286 274Q286 273 349 181T420 79Q434 60 451 53T500 46H511V0H505Q496
 * 3 418 3Q322 3 307 0H299V46H306Q330 48 330 65Q330 72 326 79Q323 84 276 153T228
 * 222L176 176V120V84Q176 65 178 59T189 49Q210 46 238 46H254V0H246Q231 3 137
 * 3T28 0H20V46H36Z" transform="translate(2196,0)"></path><path stroke-width="1"
 * d="M28 218Q28 273 48 318T98 391T163 433T229 448Q282 448 320 430T378 380T406
 * 316T415 245Q415 238 408 231H126V216Q126 68 226 36Q246 30 270 30Q312 30 342
 * 62Q359 79 369 104L379 128Q382 131 395 131H398Q415 131 415 121Q415 117 412
 * 108Q393 53 349 21T250 -11Q155 -11 92 58T28 218ZM333 275Q322 403 238
 * 411H236Q228 411 220 410T195 402T166 381T143 340T127 274V267H333V275Z"
 * transform="translate(2724,0)"></path><path stroke-width="1" d="M36 46H50Q89
 * 46 97 60V68Q97 77 97 91T98 122T98 161T98 203Q98 234 98 269T98 328L97 351Q94
 * 370 83 376T38 385H20V408Q20 431 22 431L32 432Q42 433 60 434T96 436Q112 437
 * 131 438T160 441T171 442H174V373Q213 441 271 441H277Q322 441 343 419T364
 * 373Q364 352 351 337T313 322Q288 322 276 338T263 372Q263 381 265 388T270
 * 400T273 405Q271 407 250 401Q234 393 226 386Q179 341 179 207V154Q179 141 179
 * 127T179 101T180 81T180 66V61Q181 59 183 57T188 54T193 51T200 49T207 48T216
 * 47T225 47T235 46T245 46H276V0H267Q249 3 140 3Q37 3 28 0H20V46H36Z" transform=
 * "translate(3169,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(3561,0)"></path></g></g></svg></span>
 * <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="11.122ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4788.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666
 * 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250
 * -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629
 * 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16
 * 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321
 * 597Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d=
 * "M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M128 622Q121 629 117
 * 631T101 634T58 637H25V683H36Q57 680 180 680Q315 680 324 683H335V637H302Q262
 * 636 251 634T233 622L232 500V378H517V622Q510 629 506 631T490 634T447
 * 637H414V683H425Q446 680 569 680Q704 680 713 683H724V637H691Q651 636 640
 * 634T622 622V61Q628 51 639 49T691 46H724V0H713Q692 3 569 3Q434 3 425
 * 0H414V46H447Q489 47 498 49T517 61V332H232V197L233 61Q239 51 250 49T302
 * 46H335V0H324Q303 3 180 3Q45 3 36 0H25V46H58Q100 47 109 49T128 61V622Z"
 * transform="translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659
 * 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379
 * 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125
 * 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325
 * 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254
 * 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316
 * 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(1251,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.541ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4538.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d
 * ="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M137 305T115 305T78
 * 320T63 359Q63 394 97 421T218 448Q291 448 336 416T396 340Q401 326 401 309T402
 * 194V124Q402 76 407 58T428 40Q443 40 448 56T453 109V145H493V106Q492 66 490
 * 59Q481 29 455 12T400 -6T353 12T329 54V58L327 55Q325 52 322 49T314 40T302
 * 29T287 17T269 6T247 -2T221 -8T190 -11Q130 -11 82 20T34 107Q34 128 41 147T68
 * 188T116 225T194 253T304 268H318V290Q318 324 312 340Q290 411 215 411Q197 411
 * 181 410T156 406T148 403Q170 388 170 359Q170 334 154 320ZM126 106Q126 75 150
 * 51T209 26Q247 26 276 49T315 109Q317 116 318 175Q318 233 317 233Q309 233 296
 * 232T251 223T193 203T147 166T126 106Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(1001,0)"></path></g></g></svg></span>
 * <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.411ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4482.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50
 * 562 103 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381 315T301
 * 241Q265 210 201 149L142 93L218 92Q375 92 385 97Q392 99 409
 * 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136
 * 137Q145 147 170 174T204 211T233 244T261 278T284 308T305 340T320 369T333
 * 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154 602T119 569T109
 * 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154 447T109
 * 429Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d=
 * "M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M370 305T349 305T313
 * 320T297 358Q297 381 312 396Q317 401 317 402T307 404Q281 408 258 408Q209 408
 * 178 376Q131 329 131 219Q131 137 162 90Q203 29 272 29Q313 29 338 55T374
 * 117Q376 125 379 127T395 129H409Q415 123 415 120Q415 116 411 104T395 71T366
 * 33T318 2T249 -11Q163 -11 99 53T34 214Q34 318 99 383T250 448T370 421T404
 * 357Q404 334 387 320Z" transform="translate(500,0)"></path><path stroke-width=
 * "1" d="M34 634Q34 659 50 676T93 694Q121 694 144 668T168 579Q168 525 146
 * 476T101 403T73 379Q69 379 60 388T50 401Q50 404 62 417T88 448T116 500T131
 * 572Q131 584 130 584T125 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238
 * 659 254 676T297 694Q325 694 348 668T372 579Q372 525 350 476T305 403T277
 * 379Q273 379 264 388T254 401Q254 404 266 417T292 448T320 500T335 572Q335 584
 * 334 584T329 581T316 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(945,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.606ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4566.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M127 463Q100 463 85 480T69
 * 524Q69 579 117 622T233 665Q268 665 277 664Q351 652 390 611T430 522Q430 470
 * 396 421T302 350L299 348Q299 347 308 345T337 336T375 315Q457 262 457 175Q457
 * 96 395 37T238 -22Q158 -22 100 21T42 130Q42 158 60 175T105 193Q133 193 151
 * 175T169 130Q169 119 166 110T159 94T148 82T136 74T126 70T118 67L114 66Q165 21
 * 238 21Q293 21 321 74Q338 107 338 175V195Q338 290 274 322Q259 328 213 329L171
 * 330L168 332Q166 335 166 348Q166 366 174 366Q202 366 232 371Q266 376 294
 * 413T322 525V533Q322 590 287 612Q265 626 240 626Q208 626 181 615T143 592T132
 * 580H135Q138 579 143 578T153 573T165 566T175 555T183 540T186 520Q186 498 172
 * 481T127 463Z"></path></g><g transform="translate(1424,0)"><path stroke-width=
 * "1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M36 46H50Q89 46 97
 * 60V68Q97 77 97 91T97 124T98 167T98 217T98 272T98 329Q98 366 98 407T98 482T98
 * 542T97 586T97 603Q94 622 83 628T38 637H20V660Q20 683 22 683L32 684Q42 685 61
 * 686T98 688Q115 689 135 690T165 693T176 694H179V463L180 233L240 287Q300 341
 * 304 347Q310 356 310 364Q310 383 289 385H284V431H293Q308 428 412 428Q475 428
 * 484 431H489V385H476Q407 380 360 341Q286 278 286 274Q286 273 349 181T420
 * 79Q434 60 451 53T500 46H511V0H505Q496 3 418 3Q322 3 307 0H299V46H306Q330 48
 * 330 65Q330 72 326 79Q323 84 276 153T228 222L176 176V120V84Q176 65 178 59T189
 * 49Q210 46 238 46H254V0H246Q231 3 137 3T28 0H20V46H36Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(1029,0)"></path></g></g></svg></span>
 * <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-6-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.411ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4482.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M462 0Q444 3 333 3Q217 3 199
 * 0H190V46H221Q241 46 248 46T265 48T279 53T286 61Q287 63 287 115V165H28V211L179
 * 442Q332 674 334 675Q336 677 355 677H373L379 671V211H471V165H379V114Q379 73
 * 379 66T385 54Q393 47 442 46H471V0H462ZM293 211V545L74 212L183
 * 211H293Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1"
 * d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M28 218Q28 273 48
 * 318T98 391T163 433T229 448Q282 448 320 430T378 380T406 316T415 245Q415 238
 * 408 231H126V216Q126 68 226 36Q246 30 270 30Q312 30 342 62Q359 79 369 104L379
 * 128Q382 131 395 131H398Q415 131 415 121Q415 117 412 108Q393 53 349 21T250
 * -11Q155 -11 92 58T28 218ZM333 275Q322 403 238 411H236Q228 411 220 410T195
 * 402T166 381T143 340T127 274V267H333V275Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(945,0)"></path></g></g></svg></span>
 * <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-7-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.29ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox="0
 * -863.1 4430.6 1223.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M164 157Q164 133 148 117T109
 * 101H102Q148 22 224 22Q294 22 326 82Q345 115 345 210Q345 313 318 349Q292 382
 * 260 382H254Q176 382 136 314Q132 307 129 306T114 304Q97 304 95 310Q93 314 93
 * 485V614Q93 664 98 664Q100 666 102 666Q103 666 123 658T178 642T253 634Q324 634
 * 389 662Q397 666 402 666Q410 666 410 648V635Q328 538 205 538Q174 538 149
 * 544L139 546V374Q158 388 169 396T205 412T256 420Q337 420 393 355T449 201Q449
 * 109 385 44T229 -22Q148 -22 99 32T50 154Q50 178 61 192T84 210T107 214Q132 214
 * 148 197T164 157Z"></path></g><g transform="translate(1424,0)"><path
 * stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g
 * transform="translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70
 * 367H707Q722 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56
 * 168 72 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56
 * 153Z"></path></g><g transform="translate(3037,0)"><path stroke-width="1" d=
 * "M34 634Q34 659 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101
 * 403T73 379Q69 379 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584
 * 130 584T125 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254
 * 676T297 694Q325 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379
 * 264 388T254 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329
 * 581T316 576T298 573Q273 573 256 590T238 634Z"></path><path stroke-width="1" d
 * ="M36 46H50Q89 46 97 60V68Q97 77 97 91T98 122T98 161T98 203Q98 234 98 269T98
 * 328L97 351Q94 370 83 376T38 385H20V408Q20 431 22 431L32 432Q42 433 60 434T96
 * 436Q112 437 131 438T160 441T171 442H174V373Q213 441 271 441H277Q322 441 343
 * 419T364 373Q364 352 351 337T313 322Q288 322 276 338T263 372Q263 381 265
 * 388T270 400T273 405Q271 407 250 401Q234 393 226 386Q179 341 179 207V154Q179
 * 141 179 127T179 101T180 81T180 66V61Q181 59 183 57T188 54T193 51T200 49T207
 * 48T216 47T225 47T235 46T245 46H276V0H267Q249 3 140 3Q37 3 28 0H20V46H36Z"
 * transform="translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659
 * 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379
 * 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125
 * 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325
 * 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254
 * 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316
 * 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(893,0)"></path></g></g></svg></span> <br>
 * The <em>even</em> indices are
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-8-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465
 * 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137
 * 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178
 * 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318
 * 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path></g></svg></span>,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-9-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span>, and
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-10-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M462 0Q444 3 333 3Q217 3 199 0H190V46H221Q241 46 248
 * 46T265 48T279 53T286 61Q287 63 287 115V165H28V211L179 442Q332 674 334 675Q336
 * 677 355 677H373L379 671V211H471V165H379V114Q379 73 379 66T385 54Q393 47 442
 * 46H471V0H462ZM293 211V545L74 212L183 211H293Z"></path></g></svg></span>, and
 * the <em>odd</em> indices are
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-11-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149
 * 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54
 * 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152
 * 46T177 47T193 50T201 52T207 57T213 61V578Z"></path></g></svg></span>,
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-12-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M127 463Q100 463 85 480T69 524Q69 579 117 622T233 665Q268
 * 665 277 664Q351 652 390 611T430 522Q430 470 396 421T302 350L299 348Q299 347
 * 308 345T337 336T375 315Q457 262 457 175Q457 96 395 37T238 -22Q158 -22 100
 * 21T42 130Q42 158 60 175T105 193Q133 193 151 175T169 130Q169 119 166 110T159
 * 94T148 82T136 74T126 70T118 67L114 66Q165 21 238 21Q293 21 321 74Q338 107 338
 * 175V195Q338 290 274 322Q259 328 213 329L171 330L168 332Q166 335 166 348Q166
 * 366 174 366Q202 366 232 371Q266 376 294 413T322 525V533Q322 590 287 612Q265
 * 626 240 626Q208 626 181 615T143 592T132 580H135Q138 579 143 578T153 573T165
 * 566T175 555T183 540T186 520Q186 498 172 481T127
 * 463Z"></path></g></svg></span>, and
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-13-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
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
 * 157Z"></path></g></svg></span>. We then print <em>a single line</em> of
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-14-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span>
 * space-separated strings; the first string contains the ordered characters
 * from
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-15-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>'s
 * <em>even</em> indices
 * (<span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id
 * ="MathJax-Element-16-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="3.662ex" height="2.009ex" style="vertical-align: -0.338ex;" viewBox="0
 * -719.6 1576.5 865.1" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M16 571Q16 597 27 604T74 611H125H208Q223 602 226 596T230
 * 573Q230 559 227 551T217 540T204 536T186 535H165V356H359V535H338H333Q306 535
 * 297 552Q295 556 295 573Q295 586 295 590T301 600T317 611H486Q501 602 504
 * 596T508 573Q508 559 505 551T495 540T482 536T464 535H443V76H464H470Q482 76 489
 * 75T502 64T508 38Q508 10 486 1H317Q306 5 301 11T296 21T295 38V44Q295 66 311
 * 73Q318 76 338 76H359V280H165V76H186H192Q204 76 211 75T224 64T230 38Q230 10
 * 208 1H39Q28 5 23 11T18 21T17 38V44Q17 66 33 73Q40 76 60 76H81V535H60Q45 535
 * 38 536T24 545T16 571Z"></path><path stroke-width="1" d="M291 -6Q196 -6 131
 * 60T66 216Q66 296 119 361Q154 403 200 421T273 439Q275 440 293 440H313Q400 440
 * 433 409Q454 388 454 359Q454 335 439 321T402 306Q380 306 365 321T350
 * 357V362L340 363Q339 363 326 363T303 364Q280 364 266 362Q217 352 184 313T151
 * 215Q151 153 199 112T313 70Q341 70 357 85T381 118T394 140Q402 146 424 146Q443
 * 146 447 144Q466 137 466 117Q466 106 457 88T429 47T374 10T291 -6Z" transform=
 * "translate(525,0)"></path><path stroke-width="1" d="M48 217Q48 295 100
 * 361T248 439L258 440Q268 440 274 440Q329 438 369 416T428 359T456 292T464
 * 228Q464 215 461 208T454 198T442 190L288 189H135L138 179Q153 132 199 102T303
 * 71Q336 71 353 86T380 120T398 143Q404 146 422 146Q453 146 462 126Q464 120 464
 * 116Q464 84 416 39T285 -6Q187 -6 118 59T48 217ZM377 264Q371 291 365 306T341
 * 338T294 362Q288 363 264 363Q225 363 190 336T139 264H377Z" transform=
 * "translate(1051,0)"></path></g></svg></span>), and the second string contains
 * the ordered characters from
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-17-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>'s
 * <em>odd</em> indices
 * (<span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id
 * ="MathJax-Element-18-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="3.662ex" height="2.009ex" style="vertical-align: -0.338ex;" viewBox="0
 * -719.6 1576.5 865.1" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M126 306Q105 306 90 321T74 359Q74 439 211 439Q268 439 276
 * 438Q343 426 383 390T430 306Q431 301 431 190V81Q446 79 465 78T492 76T509
 * 72T521 60T524 38Q524 11 506 3Q502 1 466 1Q426 1 406 5T379 14T355 36L345
 * 30Q284 -6 205 -6Q135 -6 92 39T48 141Q48 182 79 212T158 256T252 278T342
 * 285H347V290Q347 315 325 335T267 362Q258 363 224 363Q189 363 185 362H179L178
 * 358Q178 353 178 352T176 345T174 337T170 330T165 322T158 316T150 311T139
 * 308T126 306ZM132 140Q132 115 157 93T224 70Q269 70 302 87T344 133Q346 139 347
 * 175V211H339Q256 209 194 190T132 140Z"></path><path stroke-width="1" d="M13
 * 42Q13 63 23 69T69 76H102V535H69H54Q34 535 24 542T13 573Q13 588 15 593Q22 605
 * 29 608T56 611H95Q113 611 122 611T140 610T152 609T159 607T163 603T167 597T173
 * 589V413L174 237L295 355H275Q260 355 253 356T239 367T232 393Q232 419 243
 * 425T304 431H359H464Q479 422 482 415T485 393Q485 364 464 356L431 355H398L293
 * 254L427 76H486Q501 67 504 60T507 38Q507 28 507 24T501 12T486 1H314Q292 8 292
 * 38Q292 62 308 73Q312 75 326 76L338 77L290 140Q279 154 267 171T248 196L242
 * 204L207 171L173 139V76H206H221Q241 76 251 69T262 38Q262 11 244 3Q240 1 138
 * 1Q123 1 100 1T70 0Q32 0 23 7T13 42Z" transform=
 * "translate(525,0)"></path><path stroke-width="1" d="M327 76Q359 76 369 70T380
 * 38Q380 10 359 1H47Q24 8 24 38Q24 54 28 61T47 76H145V355H96L47 356Q24 363 24
 * 393Q24 409 28 416T47 431H207Q223 419 226 414T229 393V387V369Q297 437 394
 * 437Q436 437 461 417T487 368Q487 347 473 332T438 317Q428 317 420 320T407
 * 327T398 337T393 347T390 356L388 361Q348 356 324 345Q228 299 228 170Q228 161
 * 228 151T229 138V76H293H327Z" transform=
 * "translate(1051,0)"></path></g></svg></span>).
 * </p>
 * 
 * <p>
 * <em>Test Case 1</em>:
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-19-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="12.316ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox=
 * "0 -791.3 5302.6 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path><g transform=
 * "translate(923,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(1979,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M130 622Q123 629 119
 * 631T103 634T60 637H27V683H202H236H300Q376 683 417 677T500 648Q595 600 609
 * 517Q610 512 610 501Q610 468 594 439T556 392T511 361T472 343L456 338Q459 335
 * 467 332Q497 316 516 298T545 254T559 211T568 155T578 94Q588 46 602 31T640
 * 16H645Q660 16 674 32T692 87Q692 98 696 101T712 105T728 103T732 90Q732 59 716
 * 27T672 -16Q656 -22 630 -22Q481 -16 458 90Q456 101 456 163T449 246Q430 304 373
 * 320L363 322L297 323H231V192L232 61Q238 51 249 49T301 46H334V0H323Q302 3 181
 * 3Q59 3 38 0H27V46H60Q102 47 111 49T130 61V622ZM491 499V509Q491 527 490
 * 539T481 570T462 601T424 623T362 636Q360 636 340 636T304 637H283Q238 637 234
 * 628Q231 624 231 492V360H289Q390 360 434 378T489 456Q491 467 491 499Z"
 * transform="translate(500,0)"></path><path stroke-width="1" d="M137 305T115
 * 305T78 320T63 359Q63 394 97 421T218 448Q291 448 336 416T396 340Q401 326 401
 * 309T402 194V124Q402 76 407 58T428 40Q443 40 448 56T453 109V145H493V106Q492 66
 * 490 59Q481 29 455 12T400 -6T353 12T329 54V58L327 55Q325 52 322 49T314 40T302
 * 29T287 17T269 6T247 -2T221 -8T190 -11Q130 -11 82 20T34 107Q34 128 41 147T68
 * 188T116 225T194 253T304 268H318V290Q318 324 312 340Q290 411 215 411Q197 411
 * 181 410T156 406T148 403Q170 388 170 359Q170 334 154 320ZM126 106Q126 75 150
 * 51T209 26Q247 26 276 49T315 109Q317 116 318 175Q318 233 317 233Q309 233 296
 * 232T251 223T193 203T147 166T126 106Z" transform=
 * "translate(1237,0)"></path><path stroke-width="1" d="M41 46H55Q94 46 102
 * 60V68Q102 77 102 91T102 122T103 161T103 203Q103 234 103 269T102 328V351Q99
 * 370 88 376T43 385H25V408Q25 431 27 431L37 432Q47 433 65 434T102 436Q119 437
 * 138 438T167 441T178 442H181V402Q181 364 182 364T187 369T199 384T218 402T247
 * 421T285 437Q305 442 336 442Q450 438 463 329Q464 322 464 190V104Q464 66 466
 * 59T477 49Q498 46 526 46H542V0H534L510 1Q487 2 460 2T422 3Q319 3 310
 * 0H302V46H318Q379 46 379 62Q380 64 380 200Q379 335 378 343Q372 371 358 385T334
 * 402T308 404Q263 404 229 370Q202 343 195 315T187 232V168V108Q187 78 188 68T191
 * 55T200 49Q221 46 249 46H265V0H257L234 1Q210 2 183 2T145 3Q42 3 33
 * 0H25V46H41Z" transform="translate(1737,0)"></path><path stroke-width="1" d=
 * "M36 46H50Q89 46 97 60V68Q97 77 97 91T97 124T98 167T98 217T98 272T98 329Q98
 * 366 98 407T98 482T98 542T97 586T97 603Q94 622 83 628T38 637H20V660Q20 683 22
 * 683L32 684Q42 685 61 686T98 688Q115 689 135 690T165 693T176 694H179V463L180
 * 233L240 287Q300 341 304 347Q310 356 310 364Q310 383 289 385H284V431H293Q308
 * 428 412 428Q475 428 484 431H489V385H476Q407 380 360 341Q286 278 286 274Q286
 * 273 349 181T420 79Q434 60 451 53T500 46H511V0H505Q496 3 418 3Q322 3 307
 * 0H299V46H306Q330 48 330 65Q330 72 326 79Q323 84 276 153T228 222L176
 * 176V120V84Q176 65 178 59T189 49Q210 46 238 46H254V0H246Q231 3 137 3T28
 * 0H20V46H36Z" transform="translate(2294,0)"></path><path stroke-width="1" d=
 * "M34 634Q34 659 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101
 * 403T73 379Q69 379 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584
 * 130 584T125 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254
 * 676T297 694Q325 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379
 * 264 388T254 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329
 * 581T316 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(2822,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-20-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="11.089ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4774.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666
 * 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250
 * -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629
 * 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16
 * 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321
 * 597Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d=
 * "M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M130 622Q123 629 119
 * 631T103 634T60 637H27V683H202H236H300Q376 683 417 677T500 648Q595 600 609
 * 517Q610 512 610 501Q610 468 594 439T556 392T511 361T472 343L456 338Q459 335
 * 467 332Q497 316 516 298T545 254T559 211T568 155T578 94Q588 46 602 31T640
 * 16H645Q660 16 674 32T692 87Q692 98 696 101T712 105T728 103T732 90Q732 59 716
 * 27T672 -16Q656 -22 630 -22Q481 -16 458 90Q456 101 456 163T449 246Q430 304 373
 * 320L363 322L297 323H231V192L232 61Q238 51 249 49T301 46H334V0H323Q302 3 181
 * 3Q59 3 38 0H27V46H60Q102 47 111 49T130 61V622ZM491 499V509Q491 527 490
 * 539T481 570T462 601T424 623T362 636Q360 636 340 636T304 637H283Q238 637 234
 * 628Q231 624 231 492V360H289Q390 360 434 378T489 456Q491 467 491 499Z"
 * transform="translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659
 * 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379
 * 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125
 * 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325
 * 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254
 * 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316
 * 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(1237,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-21-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.541ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4538.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160
 * 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294
 * 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121
 * 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213
 * 61V578Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d
 * ="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M137 305T115 305T78
 * 320T63 359Q63 394 97 421T218 448Q291 448 336 416T396 340Q401 326 401 309T402
 * 194V124Q402 76 407 58T428 40Q443 40 448 56T453 109V145H493V106Q492 66 490
 * 59Q481 29 455 12T400 -6T353 12T329 54V58L327 55Q325 52 322 49T314 40T302
 * 29T287 17T269 6T247 -2T221 -8T190 -11Q130 -11 82 20T34 107Q34 128 41 147T68
 * 188T116 225T194 253T304 268H318V290Q318 324 312 340Q290 411 215 411Q197 411
 * 181 410T156 406T148 403Q170 388 170 359Q170 334 154 320ZM126 106Q126 75 150
 * 51T209 26Q247 26 276 49T315 109Q317 116 318 175Q318 233 317 233Q309 233 296
 * 232T251 223T193 203T147 166T126 106Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(1001,0)"></path></g></g></svg></span>
 * <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-22-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.671ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4594.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50
 * 562 103 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381 315T301
 * 241Q265 210 201 149L142 93L218 92Q375 92 385 97Q392 99 409
 * 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136
 * 137Q145 147 170 174T204 211T233 244T261 278T284 308T305 340T320 369T333
 * 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154 602T119 569T109
 * 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154 447T109
 * 429Z"></path></g><g transform="translate(1424,0)"><path stroke-width="1" d=
 * "M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M41 46H55Q94 46 102
 * 60V68Q102 77 102 91T102 122T103 161T103 203Q103 234 103 269T102 328V351Q99
 * 370 88 376T43 385H25V408Q25 431 27 431L37 432Q47 433 65 434T102 436Q119 437
 * 138 438T167 441T178 442H181V402Q181 364 182 364T187 369T199 384T218 402T247
 * 421T285 437Q305 442 336 442Q450 438 463 329Q464 322 464 190V104Q464 66 466
 * 59T477 49Q498 46 526 46H542V0H534L510 1Q487 2 460 2T422 3Q319 3 310
 * 0H302V46H318Q379 46 379 62Q380 64 380 200Q379 335 378 343Q372 371 358 385T334
 * 402T308 404Q263 404 229 370Q202 343 195 315T187 232V168V108Q187 78 188 68T191
 * 55T200 49Q221 46 249 46H265V0H257L234 1Q210 2 183 2T145 3Q42 3 33
 * 0H25V46H41Z" transform="translate(500,0)"></path><path stroke-width="1" d=
 * "M34 634Q34 659 50 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101
 * 403T73 379Q69 379 60 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584
 * 130 584T125 581T112 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254
 * 676T297 694Q325 694 348 668T372 579Q372 525 350 476T305 403T277 379Q273 379
 * 264 388T254 401Q254 404 266 417T292 448T320 500T335 572Q335 584 334 584T329
 * 581T316 576T298 573Q273 573 256 590T238 634Z" transform=
 * "translate(1057,0)"></path></g></g></svg></span> <br>
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-23-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="10.606ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox=
 * "0 -863.1 4566.6 1223.9" role="img" focusable="false"><g stroke=
 * "currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0
 * -1 0 0)"><path stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414
 * 284Q308 311 278 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673
 * 343 688T407 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624
 * 704 627 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549
 * 465Q549 471 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501
 * 641Q465 662 419 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425
 * 389 408T456 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492
 * 78T426 18T332 -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78
 * -18T65 -22Q52 -22 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149
 * 216Q149 214 148 207T144 186T142 153Q144 114 160 87T203 47T255 29T308
 * 24Z"></path><g transform="translate(645,0)"><path stroke-width="1" d="M118
 * -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform=
 * "translate(924,0)"><path stroke-width="1" d="M127 463Q100 463 85 480T69
 * 524Q69 579 117 622T233 665Q268 665 277 664Q351 652 390 611T430 522Q430 470
 * 396 421T302 350L299 348Q299 347 308 345T337 336T375 315Q457 262 457 175Q457
 * 96 395 37T238 -22Q158 -22 100 21T42 130Q42 158 60 175T105 193Q133 193 151
 * 175T169 130Q169 119 166 110T159 94T148 82T136 74T126 70T118 67L114 66Q165 21
 * 238 21Q293 21 321 74Q338 107 338 175V195Q338 290 274 322Q259 328 213 329L171
 * 330L168 332Q166 335 166 348Q166 366 174 366Q202 366 232 371Q266 376 294
 * 413T322 525V533Q322 590 287 612Q265 626 240 626Q208 626 181 615T143 592T132
 * 580H135Q138 579 143 578T153 573T165 566T175 555T183 540T186 520Q186 498 172
 * 481T127 463Z"></path></g><g transform="translate(1424,0)"><path stroke-width=
 * "1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform=
 * "translate(1980,0)"><path stroke-width="1" d="M56 347Q56 360 70 367H707Q722
 * 359 722 347Q722 336 708 328L390 327H72Q56 332 56 347ZM56 153Q56 168 72
 * 173H708Q722 163 722 153Q722 140 707 133H70Q56 140 56 153Z"></path></g><g
 * transform="translate(3037,0)"><path stroke-width="1" d="M34 634Q34 659 50
 * 676T93 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60
 * 388T50 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112
 * 576T94 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348
 * 668T372 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404
 * 266 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273
 * 573 256 590T238 634Z"></path><path stroke-width="1" d="M36 46H50Q89 46 97
 * 60V68Q97 77 97 91T97 124T98 167T98 217T98 272T98 329Q98 366 98 407T98 482T98
 * 542T97 586T97 603Q94 622 83 628T38 637H20V660Q20 683 22 683L32 684Q42 685 61
 * 686T98 688Q115 689 135 690T165 693T176 694H179V463L180 233L240 287Q300 341
 * 304 347Q310 356 310 364Q310 383 289 385H284V431H293Q308 428 412 428Q475 428
 * 484 431H489V385H476Q407 380 360 341Q286 278 286 274Q286 273 349 181T420
 * 79Q434 60 451 53T500 46H511V0H505Q496 3 418 3Q322 3 307 0H299V46H306Q330 48
 * 330 65Q330 72 326 79Q323 84 276 153T228 222L176 176V120V84Q176 65 178 59T189
 * 49Q210 46 238 46H254V0H246Q231 3 137 3T28 0H20V46H36Z" transform=
 * "translate(500,0)"></path><path stroke-width="1" d="M34 634Q34 659 50 676T93
 * 694Q121 694 144 668T168 579Q168 525 146 476T101 403T73 379Q69 379 60 388T50
 * 401Q50 404 62 417T88 448T116 500T131 572Q131 584 130 584T125 581T112 576T94
 * 573Q69 573 52 590T34 634ZM238 634Q238 659 254 676T297 694Q325 694 348 668T372
 * 579Q372 525 350 476T305 403T277 379Q273 379 264 388T254 401Q254 404 266
 * 417T292 448T320 500T335 572Q335 584 334 584T329 581T316 576T298 573Q273 573
 * 256 590T238 634Z" transform="translate(1029,0)"></path></g></g></svg></span>
 * <br>
 * The <em>even</em> indices are
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-24-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465
 * 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137
 * 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178
 * 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318
 * 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path></g></svg></span>
 * and
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-25-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span>, and the
 * <em>odd</em> indices are
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-26-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149
 * 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54
 * 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152
 * 46T177 47T193 50T201 52T207 57T213 61V578Z"></path></g></svg></span> and
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-27-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M127 463Q100 463 85 480T69 524Q69 579 117 622T233 665Q268
 * 665 277 664Q351 652 390 611T430 522Q430 470 396 421T302 350L299 348Q299 347
 * 308 345T337 336T375 315Q457 262 457 175Q457 96 395 37T238 -22Q158 -22 100
 * 21T42 130Q42 158 60 175T105 193Q133 193 151 175T169 130Q169 119 166 110T159
 * 94T148 82T136 74T126 70T118 67L114 66Q165 21 238 21Q293 21 321 74Q338 107 338
 * 175V195Q338 290 274 322Q259 328 213 329L171 330L168 332Q166 335 166 348Q166
 * 366 174 366Q202 366 232 371Q266 376 294 413T322 525V533Q322 590 287 612Q265
 * 626 240 626Q208 626 181 615T143 592T132 580H135Q138 579 143 578T153 573T165
 * 566T175 555T183 540T186 520Q186 498 172 481T127
 * 463Z"></path></g></svg></span>. We then print <em>a single line</em> of
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-28-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326
 * 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142
 * 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421
 * 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233
 * 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309
 * 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151
 * 535T170 489Q170 464 154 447T109 429Z"></path></g></svg></span>
 * space-separated strings; the first string contains the ordered characters
 * from
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-29-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>'s
 * <em>even</em> indices
 * (<span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id
 * ="MathJax-Element-30-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.441ex" height="2.009ex" style="vertical-align: -0.338ex;" viewBox="0
 * -719.6 1051 865.1" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M16 571Q16 598 27 605T76 612Q84 612 108 612T148 611Q268
 * 611 294 605Q346 592 389 550T432 440Q432 394 410 359Q393 329 366 310L358
 * 303Q387 273 399 239Q405 219 405 178T408 106T421 68Q426 65 428 65Q433 65 435
 * 74T438 96T441 112Q450 130 480 130H485Q519 130 522 100Q522 79 516 56T488
 * 11T434 -11Q421 -11 408 -8T377 5T344 37T324 93Q322 101 322 154L321 209Q304 257
 * 257 267Q252 268 207 268H165V76H186H192Q204 76 211 75T224 64T230 38Q230 10 208
 * 1H39Q28 5 23 11T18 21T17 38V44Q17 66 33 73Q40 76 60 76H81V535H60Q45 535 38
 * 536T24 545T16 571ZM348 440Q348 478 321 502T260 532Q252 534 208
 * 535H165V344H208Q212 344 223 344T239 345T252 346T266 348T278 351T293 358Q348
 * 387 348 440Z"></path><path stroke-width="1" d="M89 431Q94 431 105 431T122
 * 432Q173 432 173 399Q173 394 175 394Q176 394 190 404T233 425T298 436Q343 436
 * 371 423Q411 402 423 365T436 265Q436 257 436 239T435 211V198V76H498Q512 67 516
 * 60T520 38Q520 9 498 1H308Q286 9 286 32V38V45Q286 65 303 73Q309 76 329
 * 76H351V188Q351 204 351 230T352 266Q352 321 341 341T288 361Q253 361 222
 * 341T176 274L174 264L173 170V76H236Q250 67 254 60T258 38Q258 9 236 1H27Q4 8 4
 * 38Q4 53 8 60T27 76H89V355H58L27 356Q4 363 4 393Q4 408 8 415T27 431H89Z"
 * transform="translate(525,0)"></path></g></svg></span>), and the second string
 * contains the ordered characters from
 * <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id=
 * "MathJax-Element-31-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="1.499ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0
 * -791.3 645.5 936.9" role="img" focusable="false"><g stroke="currentColor"
 * fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M308 24Q367 24 416 76T466 197Q466 260 414 284Q308 311 278
 * 321T236 341Q176 383 176 462Q176 523 208 573T273 648Q302 673 343 688T407
 * 704H418H425Q521 704 564 640Q565 640 577 653T603 682T623 704Q624 704 627
 * 704T632 705Q645 705 645 698T617 577T585 459T569 456Q549 456 549 465Q549 471
 * 550 475Q550 478 551 494T553 520Q553 554 544 579T526 616T501 641Q465 662 419
 * 662Q362 662 313 616T263 510Q263 480 278 458T319 427Q323 425 389 408T456
 * 390Q490 379 522 342T554 242Q554 216 546 186Q541 164 528 137T492 78T426 18T332
 * -20Q320 -22 298 -22Q199 -22 144 33L134 44L106 13Q83 -14 78 -18T65 -22Q52 -22
 * 52 -14Q52 -11 110 221Q112 227 130 227H143Q149 221 149 216Q149 214 148 207T144
 * 186T142 153Q144 114 160 87T203 47T255 29T308 24Z"></path></g></svg></span>'s
 * <em>odd</em> indices
 * (<span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id
 * ="MathJax-Element-32-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink"
 * width="2.441ex" height="2.009ex" style="vertical-align: -0.338ex;" viewBox="0
 * -719.6 1051 865.1" role="img" focusable="false"><g stroke="currentColor" fill
 * ="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path
 * stroke-width="1" d="M126 306Q105 306 90 321T74 359Q74 439 211 439Q268 439 276
 * 438Q343 426 383 390T430 306Q431 301 431 190V81Q446 79 465 78T492 76T509
 * 72T521 60T524 38Q524 11 506 3Q502 1 466 1Q426 1 406 5T379 14T355 36L345
 * 30Q284 -6 205 -6Q135 -6 92 39T48 141Q48 182 79 212T158 256T252 278T342
 * 285H347V290Q347 315 325 335T267 362Q258 363 224 363Q189 363 185 362H179L178
 * 358Q178 353 178 352T176 345T174 337T170 330T165 322T158 316T150 311T139
 * 308T126 306ZM132 140Q132 115 157 93T224 70Q269 70 302 87T344 133Q346 139 347
 * 175V211H339Q256 209 194 190T132 140Z"></path><path stroke-width="1" d="M13
 * 42Q13 63 23 69T69 76H102V535H69H54Q34 535 24 542T13 573Q13 588 15 593Q22 605
 * 29 608T56 611H95Q113 611 122 611T140 610T152 609T159 607T163 603T167 597T173
 * 589V413L174 237L295 355H275Q260 355 253 356T239 367T232 393Q232 419 243
 * 425T304 431H359H464Q479 422 482 415T485 393Q485 364 464 356L431 355H398L293
 * 254L427 76H486Q501 67 504 60T507 38Q507 28 507 24T501 12T486 1H314Q292 8 292
 * 38Q292 62 308 73Q312 75 326 76L338 77L290 140Q279 154 267 171T248 196L242
 * 204L207 171L173 139V76H206H221Q241 76 251 69T262 38Q262 11 244 3Q240 1 138
 * 1Q123 1 100 1T70 0Q32 0 23 7T13 42Z" transform=
 * "translate(525,0)"></path></g></svg></span>).
 * </p>
 * </div></div></div></div></div>
 *
 */
public class Day06ReviewLoop {

    public static void main(String[] args) {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
	Scanner scan = null;
	try {
	    int n;
	    int strLen;
	    String temp;
	    String mainString;
	    String oddString = "";
	    String evenString = "";
	    scan = new Scanner(System.in);

	    n = scan.nextInt();

	    for (int i = 0; i < n; i++) {

		mainString = scan.next();
		strLen = mainString.length();

		evenString = "";
		oddString = "";

		for (int j = 0; j < strLen; j++) {
		    temp = mainString.charAt(j) + "";
		    if (j % 2 == 0) {
			evenString = evenString + temp;
		    } else {
			oddString = oddString + temp;
		    }
		}
		temp = evenString + " " + oddString;
		System.out.println(temp);
	    }
	} catch (Exception e) {
	    System.out.println("Error caused due to " + e);
	} finally {
	    try {
		if (scan != null)
		    scan.close();
	    } catch (Exception e) {
		System.out.println("Error caused while closing scanner due to " + e);
	    }
	}
    }
}