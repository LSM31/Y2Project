public class MarkovMethods {
        private double[][] transitionMatrix = {
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0,
                                        0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0,
                                        0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077, 0,
                                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 1, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0.307692308, 0.384615385, 0.461538462, 0.538461538, 0.615384615,
                                        0.692307692,
                                        0.769230769, 0.846153846, 0.923076923, 0, 1 }
        };

        private double[][] meanHittingTimes = {
                        { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
                                        1.0 },
                        { 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
                                        1.0 },
                        { 1.0, 1.076923077, 0.0, 1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077,
                                        1.076923077,
                                        1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077,
                                        1.076923077,
                                        1.076923077, 1.076923077, 1.076923077 },
                        { 1.076923077, 1.076923077, 1.153846154, 0.0, 1.153846154, 1.153846154, 1.153846154,
                                        1.153846154,
                                        1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154,
                                        1.153846154,
                                        1.153846154, 1.153846154, 1.153846154, 1.153846154 },
                        { 1.153846154, 1.159763313775148, 1.153846154, 1.236686390775148, 0.0, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148, 1.236686390775148, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148, 1.236686390775148, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148 },
                        { 1.236686390775148, 1.242603550550296, 1.242603550550296, 1.236686390775148,
                                        1.3254437873254439, 0.0,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439, 1.3254437873254439,
                                        1.3254437873254439,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439, 1.3254437873254439,
                                        1.3254437873254439,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439 },
                        { 1.3254437873254439, 1.3318161132375967, 1.3313609471005918, 1.3318161132375967,
                                        1.3254437873254439,
                                        1.4205735097878927, 0.0, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927,
                                        1.4205735097878927, 1.4205735097878927, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927,
                                        1.4205735097878927, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927 },
                        { 1.4205735097878927, 1.4274010018370507, 1.4269458357000455, 1.4269458357000455,
                                        1.4274010018370507,
                                        1.4205735097878927, 1.5225307242994994, 0.0, 1.5225307242994994,
                                        1.5225307242994994,
                                        1.5225307242994994, 1.5225307242994994, 1.5225307242994994, 1.5225307242994994,
                                        1.5225307242994994,
                                        1.5225307242994994, 1.5225307242994994, 1.5225307242994994,
                                        1.5225307242994994 },
                        { 1.6318056097770737, 1.6396484724396556, 1.6391232807430414, 1.6391582935228457,
                                        1.639158293522846,
                                        1.6391232807430414, 1.6396484724396556, 1.6318056097770737, 0.0,
                                        1.74892335791723, 1.74892335791723,
                                        1.74892335791723, 1.74892335791723, 1.74892335791723, 1.74892335791723,
                                        1.74892335791723,
                                        1.74892335791723, 1.74892335791723, 1.74892335791723 },
                        { 1.7573291183469877, 1.7657752781380636, 1.7652096870801308, 1.7652473931506922,
                                        1.7652473931506925,
                                        1.765209687080131, 1.7657752781380636, 1.7573291183469877, 1.74892335791723,
                                        0.0,
                                        1.8834559240453956, 1.8834559240453956, 1.8834559240453956, 1.8834559240453956,
                                        1.8834559240453956,
                                        1.8834559240453956, 1.8834559240453956, 1.8834559240453956,
                                        1.8834559240453956 },
                        { 1.892508281431935, 2.132373376822974, 2.1317642787605418, 2.131804885298072,
                                        2.1318048852980724,
                                        2.1317642787605418, 2.132373376822974, 2.123277512431935, 2.1142251550453954,
                                        2.1142251550453954,
                                        0.0, 2.2591063801168456, 2.2591063801168456, 2.2591063801168456,
                                        2.2591063801168456,
                                        2.2591063801168456, 2.2591063801168456, 2.2591063801168456,
                                        2.2591063801168456 },
                        { 2.2688550726876615, 2.065632867281078, 2.2957461465214886, 2.295789876638832,
                                        2.2957898766388323,
                                        2.2957461465214886, 2.296402098281078, 2.2866065520131054, 2.2768578594422895,
                                        2.2768578594422895,
                                        2.2591063801168456, 0.0, 2.4328837941457655, 2.4328837941457655,
                                        2.4328837941457655,
                                        2.4328837941457655, 2.4328837941457655, 2.4328837941457655,
                                        2.4328837941457655 },
                        { 2.443382386145855, 2.396125336710115, 2.1646496961228143, 2.413217500420785,
                                        2.413217500420785,
                                        2.413170406448258, 2.413876816035559, 2.4033277662077577, 2.3928291742076677,
                                        2.3928291742076677,
                                        2.373712196471209, 2.373712196471209, 0.0, 2.560857103900336, 2.560857103900336,
                                        2.560857103900336,
                                        2.560857103900336, 2.560857103900336, 2.560857103900336 },
                        { 2.57216327990124, 2.580442670487518, 2.520510324026583, 2.273405828697957, 2.5396780183488445,
                                        2.5396273017630424, 2.5403880505494203, 2.5290275353494387, 2.517721359348534,
                                        2.517721359348534,
                                        2.4971338448616467, 2.4971338448616467, 2.5016855062257797, 0.0,
                                        2.698674514415102,
                                        2.698674514415102, 2.698674514415102, 2.698674514415102, 2.698674514415102 },
                        { 2.7108503962630994, 2.715215001684826, 2.714395733760975, 2.6508321309233374,
                                        2.385925439683465,
                                        2.6712599892091737, 2.6720792571330243, 2.659844856147555, 2.647668974299557,
                                        2.647668974299557,
                                        2.625497804850556, 2.625497804850556, 2.63039959401228, 2.6349512553764134, 0.0,
                                        2.842541602846704,
                                        2.842541602846704, 2.842541602846704, 2.842541602846704 },
                        { 2.8556540909916377, 2.860354435292294, 2.8549204853947203, 2.854742295044427,
                                        2.786572412981019,
                                        2.5025949631084883, 2.8093488951767487, 2.7961733864222253, 2.7830608982772906,
                                        2.7830608982772906,
                                        2.7591842542535843, 2.7591842542535843, 2.7644631041204333, 2.7693648932821575,
                                        2.7742666824438817,
                                        0.0, 2.992923729035362, 2.992923729035362, 2.992923729035362 },
                        { 3.0070448701155303, 3.011756651565161, 3.0062548333187937, 3.0011611468567403,
                                        3.000924137270834,
                                        2.9277972021257685, 2.6244512905630257, 2.9380869375667866, 2.923965796486618,
                                        2.923965796486618,
                                        2.8982524875361744, 2.8982524875361744, 2.9039374027778027, 2.9092162526446517,
                                        2.914495102511501,
                                        2.919747019470816, 0.0, 3.1499719219345304, 3.1499719219345304 },
                        { 3161.5450665129893, 3166.243213854222, 3160.330725959909, 3155.2044128739776,
                                        3149.707423652118,
                                        3149.38482320244, 3072.1714831632003, 2731.227274787046, 3066.9307007440943,
                                        3066.9307007440943,
                                        3039.306695142015, 3039.306695142015, 3045.4167545839177, 3051.09078727361,
                                        3056.7648199631585,
                                        3062.4099573721774, 3068.028261525369, 0.0, 3309.815316280611 },
                        { 14809.101880940209, 14804.274045756718, 14733.421956836779, 14661.76887594862,
                                        14584.58142718591,
                                        14496.319702668374, 14478.502234016325, 14717.488406079518, 14155.89661425246,
                                        14021.56718957901,
                                        13674.360610814718, 13500.876587425531, 13367.001533512373, 13223.756081076684,
                                        13074.488421521151,
                                        12918.765045845019, 12756.434703432938, 15657.879357353992, 0.0 },
        };

        private double[][] dealerMatrix = {
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0,
                                        0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0,
                                        0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077, 0,
                                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0.076923077, 0.307692308, 0.076923077, 0.076923077, 0.076923077,
                                        0.076923077,
                                        0.076923077, 0.076923077, 0.076923077, 0.076923077, 0.076923077, 1, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.307692308, 0.384615385, 0.461538462, 0.538461538, 0.615384615,
                                        0.692307692, 0.769230769, 0.846153846, 0.923076923, 0, 1 },
        };

        private double[][] dealerMeanHittingTimes = {
                        { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
                                        1.0, 1.0 },
                        { 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
                                        1.0, 1.0 },
                        { 1.0, 1.076923077, 0.0, 1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077,
                                        1.076923077,
                                        1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077,
                                        1.076923077,
                                        1.076923077, 1.076923077, 1.076923077, 1.076923077, 1.076923077 },
                        { 1.076923077, 1.076923077, 1.153846154, 0.0, 1.153846154, 1.153846154, 1.153846154,
                                        1.153846154,
                                        1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154,
                                        1.153846154,
                                        1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154, 1.153846154 },
                        { 1.153846154, 1.159763313775148, 1.153846154, 1.236686390775148, 0.0, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148, 1.236686390775148, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148, 1.236686390775148, 1.236686390775148,
                                        1.236686390775148,
                                        1.236686390775148, 1.236686390775148, 1.236686390775148, 1.236686390775148 },
                        { 1.236686390775148, 1.242603550550296, 1.242603550550296, 1.236686390775148,
                                        1.3254437873254439, 0.0,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439, 1.3254437873254439,
                                        1.3254437873254439,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439, 1.3254437873254439,
                                        1.3254437873254439,
                                        1.3254437873254439, 1.3254437873254439, 1.3254437873254439, 1.3254437873254439,
                                        1.3254437873254439 },
                        { 1.3254437873254439, 1.3318161132375967, 1.3313609471005918, 1.3318161132375967,
                                        1.3254437873254439,
                                        1.4205735097878927, 0.0, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927,
                                        1.4205735097878927, 1.4205735097878927, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927,
                                        1.4205735097878927, 1.4205735097878927, 1.4205735097878927, 1.4205735097878927,
                                        1.4205735097878927,
                                        1.4205735097878927 },
                        { 1.4205735097878927, 1.4274010018370507, 1.4269458357000455, 1.4269458357000455,
                                        1.4274010018370507,
                                        1.4205735097878927, 1.5225307242994994, 0.0, 1.5225307242994994,
                                        1.5225307242994994,
                                        1.5225307242994994, 1.5225307242994994, 1.5225307242994994, 1.5225307242994994,
                                        1.5225307242994994,
                                        1.5225307242994994, 1.5225307242994994, 1.5225307242994994, 1.5225307242994994,
                                        1.5225307242994994,
                                        1.5225307242994994 },
                        { 1.5225307242994994, 1.529848395265467, 1.5293582163486574, 1.5293932291284618,
                                        1.5293582163486574,
                                        1.529848395265467, 1.5225307242994994, 1.6318056097770737, 0.0,
                                        1.6318056097770737,
                                        1.6318056097770737, 1.6318056097770737, 1.6318056097770737, 1.6318056097770737,
                                        1.6318056097770737,
                                        1.6318056097770737, 1.6318056097770737, 1.6318056097770737, 1.6318056097770737,
                                        1.6318056097770737,
                                        1.6318056097770737 },
                        { 1.6318056097770737, 1.6396484724396556, 1.6391232807430414, 1.6391582935228457,
                                        1.639158293522846,
                                        1.6391232807430414, 1.6396484724396556, 1.6318056097770737, 1.74892335791723,
                                        0.0, 1.74892335791723,
                                        1.74892335791723, 1.74892335791723, 1.74892335791723, 1.74892335791723,
                                        1.74892335791723,
                                        1.74892335791723, 1.74892335791723, 1.74892335791723, 1.74892335791723,
                                        1.74892335791723 },
                        { 1.8744468664871436, 2.1142251550453954, 2.1136218579169013, 2.1136622572782198,
                                        2.113659563987463,
                                        2.113659563987463, 2.1136622572782198, 2.1136218579169013, 2.1142251550453954,
                                        2.1052160974871437,
                                        0.0, 2.2397486636153094, 2.2397486636153094, 2.2397486636153094,
                                        2.2397486636153094,
                                        2.2397486636153094, 2.2397486636153094, 2.2397486636153094, 2.2397486636153094,
                                        2.2397486636153094,
                                        2.2397486636153094 },
                        { 2.2494043181303427, 2.0460886284422894, 2.276208154842326, 2.2762516618468256,
                                        2.2762487613798568,
                                        2.2762487613798568, 2.276251661846826, 2.276208154842326, 2.2768578594422895,
                                        2.2671557974557865,
                                        2.2397486636153094, 0.0, 2.4120370225272367, 2.4120370225272367,
                                        2.4120370225272367,
                                        2.4120370225272367, 2.4120370225272367, 2.4120370225272367, 2.4120370225272367,
                                        2.4120370225272367,
                                        2.4120370225272367 },
                        { 2.422435419698016, 2.375077694882224, 2.1436087820052903, 2.392176346027891,
                                        2.3921732224480783,
                                        2.3921732224480783, 2.3921763460278913, 2.392129492330734, 2.3928291742076677,
                                        2.3823807997599182,
                                        2.3528654248526806, 2.3528654248526806, 0.0, 2.5384067344633943,
                                        2.5384067344633943,
                                        2.5384067344633943, 2.5384067344633943, 2.5384067344633943, 2.5384067344633943,
                                        2.5384067344633943,
                                        2.5384067344633943 },
                        { 2.5496050083404174, 2.5577759792866317, 2.497850878052247, 2.2507461239655293,
                                        2.5170149497612337,
                                        2.5170149497612337, 2.517018313616417, 2.516967855788706, 2.517721359348534,
                                        2.506469263788616,
                                        2.4746834754247047, 2.4746834754247047, 2.479235136788838, 0.0,
                                        2.674497193481284,
                                        2.674497193481284, 2.674497193481284, 2.674497193481284, 2.674497193481284,
                                        2.674497193481284,
                                        2.674497193481284 },
                        { 2.686556873042017, 2.6908047188513584, 2.6899932534791775, 2.62642937197898,
                                        2.3615190581258325,
                                        2.6469082255131786, 2.6469118481264537, 2.6468575089273765, 2.647668974299557,
                                        2.6355513329264717,
                                        2.601320483916738, 2.601320483916738, 2.606222273078462, 2.6107739344425953,
                                        0.0, 2.81650448799304,
                                        2.81650448799304, 2.81650448799304, 2.81650448799304, 2.81650448799304,
                                        2.81650448799304 },
                        { 2.829491835213218, 2.834066438392836, 2.828640891243215, 2.8284624007947805,
                                        2.760288617455538,
                                        2.47636998681862, 2.7822455316292753, 2.7821870124918027, 2.7830608982772906,
                                        2.7700111306438053,
                                        2.7331471393999207, 2.7331471393999207, 2.7384259892667697, 2.743327778428494,
                                        2.7482295675902177,
                                        0.0, 2.9648837591909523, 2.9648837591909523, 2.9648837591909523,
                                        2.9648837591909523,
                                        2.9648837591909523 },
                        { 2.9788701331213736, 2.9834465010560303, 2.9779537319228435, 2.972859722278176,
                                        2.9726185113182937,
                                        2.899554919965432, 2.595263052894431, 2.9230246887175637, 2.923965796486618,
                                        2.90991220057263,
                                        2.870212517691764, 2.870212517691764, 2.8758974329333924, 2.881176282800242,
                                        2.886455132667091,
                                        2.8917070496264063, 0.0, 3.1197750313307013, 3.1197750313307013,
                                        3.1197750313307013,
                                        3.1197750313307013 },
                        { 3.134837280179923, 3.1394155486200073, 3.1335002587838447, 3.128364530040633,
                                        3.122852847432195,
                                        3.122597606339662, 3.0442947024563463, 2.718090870976357, 3.070457616071263,
                                        3.0553229743166566,
                                        3.0125694696726706, 3.0125694696726706, 3.0186916860871693, 3.0243766013287976,
                                        3.0300615165704254,
                                        3.0357174271423997, 3.04134640480684, 0.0, 3.281329099764569, 3.281329099764569,
                                        3.281329099764569 },
                        { 3.297549983141813, 3.302103365372515, 3.2957599861483415, 3.2902022684400314,
                                        3.28464367095103,
                                        3.278739818263842, 3.278471218264088, 3.194470424569635, 2.8460185337995068,
                                        3.206290214541584,
                                        3.160247978767849, 3.160247978767849, 3.1668411349070107, 3.1729633513215094,
                                        3.1790855677360077,
                                        3.1851765483524153, 3.1912385242991683, 3.1972714955762678, 0.0,
                                        3.4496814265797986,
                                        3.4496814265797986 },
                        { 3462.690394957368, 3467.1622821734704, 3460.373143360166, 3454.399388093815,
                                        3448.3979540153723,
                                        3442.4554042530253, 3436.1456226959517, 3435.774837920574, 3347.0914257134227,
                                        2955.499761711129,
                                        3309.039403362327, 3309.039403362327, 3316.1246118162353, 3322.704204891426,
                                        3329.2837979664423,
                                        3335.829884160703, 3342.344854591482, 3348.8287092589294, 3355.2816066209707,
                                        0.0,
                                        3620.03736085017 },
                        { 16501.918615961695, 16497.30980479013, 16427.346498769093, 16356.551558281562,
                                        16279.879683473546,
                                        16197.24318055055, 16108.613968288953, 16007.239157659562, 15986.775021752137,
                                        16261.262694954783,
                                        15418.157908946885, 15246.157798855887, 15112.892828978072, 14970.450755670847,
                                        14822.11870480007,
                                        14667.478003218735, 14506.38800926409, 14338.699882140567, 14164.280016088804,
                                        17341.349063397705,
                                        0.0 }
        };

        public MarkovMethods() {
        }

        public double[][] tMatrix() {
                return transitionMatrix;
        }

        public double[][] dealterTMatrix() {
                return dealerMatrix;
        }

        public double[][] dealerHittingTimes() {
                return dealerMeanHittingTimes;
        }

        public double[][] meanHittingTimes() {
                reutrn meanHittingTimes;
        }

        public double[] MatrixMultiply(double[] currentState, String selection) {
                double[][] matrixChoice = null;

                if (selection.equals("playerTransition")) {
                        matrixChoice = transitionMatrix;
                }

                if (selection.equals("playerTimes")) {
                        matrixChoice = meanHittingTimes;
                }

                if (selection.equals("dealerTransition")) {
                        matrixChoice = dealerMatrix;
                }

                if (selection.equals("dealerTimes")) {
                        matrixChoice = dealerMeanHittingTimes;
                }

                double[] result = new double[currentState.length];
                int index = 0;

                for (double[] row : matrixChoice) {
                        double dotProduct = 0;
                        for (int i = 0; i < row.length; i++) {
                                dotProduct += row[i] * currentState[i];
                        }
                        result[index] = dotProduct;
                        index++;
                }

                return result;
        }

        public double[] totalState(int cardTotal) {
                double[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
                result[cardTotal - 4] = 1;
                return result;
        }

        public double[] dealerState(int cardTotal) {
                double[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
                result[cardTotal - 2] = 1;
                return result;
        }

        public double winIndex(int cardTotal, String playerType) {
                double result = 0;
                if (playerType.equals("Player")) {
                        double[] timeMatrix = MatrixMultiply(totalState(cardTotal), "playerTimes");
                        result = (timeMatrix[timeMatrix.length - 2] / timeMatrix[timeMatrix.length - 1]);
                }
                if (playerType.equals("Dealer")) {
                        double[] timeMatrix = MatrixMultiply(dealerState(cardTotal), "dealerTimes");
                        result = (timeMatrix[timeMatrix.length - 2] / timeMatrix[timeMatrix.length - 1]);
                }

                return result;
        }
}
