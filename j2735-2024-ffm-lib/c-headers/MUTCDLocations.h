/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_MUTCDLocations_H_
#define	_MUTCDLocations_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum MUTCDLocations {
	MUTCDLocations_ahead	= 13569,
	MUTCDLocations_here	= 13570,
	MUTCDLocations_here_to	= 13571,
	MUTCDLocations_here_to_alley	= 13572,
	MUTCDLocations_here_to_corner	= 13573,
	MUTCDLocations_here_to_sign	= 13574,
	MUTCDLocations_between_signs	= 13575,
	MUTCDLocations_between	= 13633,
	MUTCDLocations_this_side_of_street	= 13576,
	MUTCDLocations_this_side_of_sign	= 13577,
	MUTCDLocations_right	= 13579,
	MUTCDLocations_left	= 13580,
	MUTCDLocations_begin_point	= 13581,
	MUTCDLocations_next	= 13582,
	MUTCDLocations_starting_start	= 13611,
	MUTCDLocations_ends_end	= 13583,
	MUTCDLocations_other_Side	= 13584,
	MUTCDLocations_crossing	= 13585,
	MUTCDLocations_crosswalks	= 13586,
	MUTCDLocations_center_strip	= 13587,
	MUTCDLocations_lane	= 13588,
	MUTCDLocations_shelter	= 13634,
	MUTCDLocations_center	= 13635,
	MUTCDLocations_hill	= 13589,
	MUTCDLocations_both_ways_left_and_right	= 13590,
	MUTCDLocations_both_ways_45_degree_angle_tilting_right	= 13591,
	MUTCDLocations_both_ways_45_degree_angle_tilting_left	= 13592,
	MUTCDLocations_both_directions_of_travel	= 13593,
	MUTCDLocations_left_arrow	= 13610,
	MUTCDLocations_left_turn	= 13594,
	MUTCDLocations_left_45_degree_arrow	= 13595,
	MUTCDLocations_left_45_degree_turn	= 13596,
	MUTCDLocations_ahead_and_to_the_left	= 13597,
	MUTCDLocations_ahead_and_to_the_left_at_a_45_degree_angle	= 13598,
	MUTCDLocations_right_arrow	= 13609,
	MUTCDLocations_right_turn	= 13599,
	MUTCDLocations_right_45_degree_arrow	= 13600,
	MUTCDLocations_right_45_degree_turn	= 13601,
	MUTCDLocations_ahead_and_to_the_right	= 13602,
	MUTCDLocations_ahead_and_to_the_right_at_a_45_degree_angle	= 13603,
	MUTCDLocations_downward_left_45_degree	= 13604,
	MUTCDLocations_downward_right_45_degree	= 13605,
	MUTCDLocations_downward_left_and_right_45_degree	= 13606,
	MUTCDLocations_reverse_turn_to_right	= 13636,
	MUTCDLocations_reverse_turn_to_left	= 13637,
	MUTCDLocations_reverse_curve_to_right	= 13638,
	MUTCDLocations_reverse_curve_to_left	= 13639,
	MUTCDLocations_two_lane_reverse_curve_to_right	= 13623,
	MUTCDLocations_two_lane_reverse_curve_to_left	= 13624,
	MUTCDLocations_three_lane_reverse_curve_to_right	= 13625,
	MUTCDLocations_three_lane_reverse_curve_to_left	= 13626,
	MUTCDLocations_winding_road_to_right	= 13640,
	MUTCDLocations_winding_road_to_left	= 13641,
	MUTCDLocations_chevron_right	= 13613,
	MUTCDLocations_chevron_left	= 13614,
	MUTCDLocations_right_turn_with_junction	= 13615,
	MUTCDLocations_left_turn_with_junction	= 13616,
	MUTCDLocations_hairpin_right	= 13617,
	MUTCDLocations_hairpin_left	= 13618,
	MUTCDLocations_truck_rollover_right	= 13619,
	MUTCDLocations_truck_rollover_left	= 13620,
	MUTCDLocations_n270_degree_turn_right	= 13621,
	MUTCDLocations_n270_degree_turn_left	= 13622,
	MUTCDLocations_double_reverse_curve_to_right	= 13627,
	MUTCDLocations_double_reverse_curve_to_left	= 13628,
	MUTCDLocations_two_lane_double_reverse_curve_to_right	= 13629,
	MUTCDLocations_two_lane_double_reverse_curve_to_left	= 13630,
	MUTCDLocations_three_lane_double_reverse_curve_to_right	= 13631,
	MUTCDLocations_three_lane_double_reverse_curve_to_left	= 13632
} e_MUTCDLocations;

/* MUTCDLocations */
typedef long	 MUTCDLocations_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_MUTCDLocations;
asn_struct_free_f MUTCDLocations_free;
asn_struct_print_f MUTCDLocations_print;
asn_constr_check_f MUTCDLocations_constraint;
ber_type_decoder_f MUTCDLocations_decode_ber;
der_type_encoder_f MUTCDLocations_encode_der;
xer_type_decoder_f MUTCDLocations_decode_xer;
xer_type_encoder_f MUTCDLocations_encode_xer;
jer_type_encoder_f MUTCDLocations_encode_jer;
oer_type_decoder_f MUTCDLocations_decode_oer;
oer_type_encoder_f MUTCDLocations_encode_oer;
per_type_decoder_f MUTCDLocations_decode_uper;
per_type_encoder_f MUTCDLocations_encode_uper;
per_type_decoder_f MUTCDLocations_decode_aper;
per_type_encoder_f MUTCDLocations_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _MUTCDLocations_H_ */
#include "asn_internal.h"
