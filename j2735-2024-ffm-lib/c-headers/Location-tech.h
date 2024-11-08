/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Location_tech_H_
#define	_Location_tech_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum Location_tech {
	Location_tech_loc_tech_unknown	= 0,
	Location_tech_loc_tech_GNSS	= 1,
	Location_tech_loc_tech_DGPS	= 2,
	Location_tech_loc_tech_RTK	= 3,
	Location_tech_loc_tech_PPP	= 4,
	Location_tech_loc_tech_drGPS	= 5,
	Location_tech_loc_tech_drDGPS	= 6,
	Location_tech_loc_tech_dr	= 7,
	Location_tech_loc_tech_nav	= 8,
	Location_tech_loc_tech_fault	= 9
	/*
	 * Enumeration is extensible
	 */
} e_Location_tech;

/* Location-tech */
typedef long	 Location_tech_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Location_tech;
asn_struct_free_f Location_tech_free;
asn_struct_print_f Location_tech_print;
asn_constr_check_f Location_tech_constraint;
ber_type_decoder_f Location_tech_decode_ber;
der_type_encoder_f Location_tech_encode_der;
xer_type_decoder_f Location_tech_decode_xer;
xer_type_encoder_f Location_tech_encode_xer;
jer_type_encoder_f Location_tech_encode_jer;
oer_type_decoder_f Location_tech_decode_oer;
oer_type_encoder_f Location_tech_encode_oer;
per_type_decoder_f Location_tech_decode_uper;
per_type_encoder_f Location_tech_encode_uper;
per_type_decoder_f Location_tech_decode_aper;
per_type_encoder_f Location_tech_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _Location_tech_H_ */
#include "asn_internal.h"
