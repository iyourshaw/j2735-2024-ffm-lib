/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AdviceInstructionsRecommendations_H_
#define	_AdviceInstructionsRecommendations_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum AdviceInstructionsRecommendations {
	AdviceInstructionsRecommendations_drive_carefully	= 7169,
	AdviceInstructionsRecommendations_drive_with_extreme_caution	= 7170,
	AdviceInstructionsRecommendations_approach_with_care	= 7171,
	AdviceInstructionsRecommendations_keep_your_distance	= 7172,
	AdviceInstructionsRecommendations_increase_normal_following_distance	= 7173,
	AdviceInstructionsRecommendations_test_your_brakes	= 7174,
	AdviceInstructionsRecommendations_cross_intersection_with_care	= 7175,
	AdviceInstructionsRecommendations_pass_with_care	= 7176,
	AdviceInstructionsRecommendations_pass	= 7200,
	AdviceInstructionsRecommendations_use_low_beam_headlights	= 7177,
	AdviceInstructionsRecommendations_use_fog_lights	= 7178,
	AdviceInstructionsRecommendations_use_hazard_warning_lights	= 7179,
	AdviceInstructionsRecommendations_do_not_leave_your_vehicle	= 7180,
	AdviceInstructionsRecommendations_leave_your_vehicle_and_proceed_to_next_safe_place	= 7181,
	AdviceInstructionsRecommendations_turn_off_engine	= 7182,
	AdviceInstructionsRecommendations_close_all_windows_turn_off_heater_air_conditioner_and_vents	= 7183,
	AdviceInstructionsRecommendations_turn_off_air_conditioner_to_prevent_engine_overheating	= 7184,
	AdviceInstructionsRecommendations_turn_off_mobile_phones_and_two_way_radios	= 7185,
	AdviceInstructionsRecommendations_prepare_to_stop	= 7186,
	AdviceInstructionsRecommendations_be_prepared_to_stop	= 7201,
	AdviceInstructionsRecommendations_stop_at_next_rest_area	= 7187,
	AdviceInstructionsRecommendations_stop_at_next_safe_place	= 7188,
	AdviceInstructionsRecommendations_only_travel_if_absolutely_necessary	= 7189,
	AdviceInstructionsRecommendations_drive_to_another_service_area	= 7190,
	AdviceInstructionsRecommendations_use_through_traffic_lanes	= 7191,
	AdviceInstructionsRecommendations_use_local_traffic_lanes	= 7192,
	AdviceInstructionsRecommendations_use_left_hand_parallel_roadway	= 7193,
	AdviceInstructionsRecommendations_use_right_hand_parallel_roadway	= 7194,
	AdviceInstructionsRecommendations_use_heavy_vehicle_lane	= 7195,
	AdviceInstructionsRecommendations_observe_recommended_speed	= 7196,
	AdviceInstructionsRecommendations_signals_sequenced_for_speed	= 7202,
	AdviceInstructionsRecommendations_maintain_top_safe_speed	= 7203,
	AdviceInstructionsRecommendations_facing_traffic	= 7197,
	AdviceInstructionsRecommendations_push_button	= 7198,
	AdviceInstructionsRecommendations_to_cross_street	= 7199,
	AdviceInstructionsRecommendations_evacuate_area_voluntarily	= 7204,
	AdviceInstructionsRecommendations_shelter_in_place	= 7205
} e_AdviceInstructionsRecommendations;

/* AdviceInstructionsRecommendations */
typedef long	 AdviceInstructionsRecommendations_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_AdviceInstructionsRecommendations_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_AdviceInstructionsRecommendations;
asn_struct_free_f AdviceInstructionsRecommendations_free;
asn_struct_print_f AdviceInstructionsRecommendations_print;
asn_constr_check_f AdviceInstructionsRecommendations_constraint;
ber_type_decoder_f AdviceInstructionsRecommendations_decode_ber;
der_type_encoder_f AdviceInstructionsRecommendations_encode_der;
xer_type_decoder_f AdviceInstructionsRecommendations_decode_xer;
xer_type_encoder_f AdviceInstructionsRecommendations_encode_xer;
jer_type_encoder_f AdviceInstructionsRecommendations_encode_jer;
oer_type_decoder_f AdviceInstructionsRecommendations_decode_oer;
oer_type_encoder_f AdviceInstructionsRecommendations_encode_oer;
per_type_decoder_f AdviceInstructionsRecommendations_decode_uper;
per_type_encoder_f AdviceInstructionsRecommendations_encode_uper;
per_type_decoder_f AdviceInstructionsRecommendations_decode_aper;
per_type_encoder_f AdviceInstructionsRecommendations_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _AdviceInstructionsRecommendations_H_ */
#include "asn_internal.h"