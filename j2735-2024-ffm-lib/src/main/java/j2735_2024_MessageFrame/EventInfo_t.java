// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct EventInfo {
 *     EventIdentifier_t eventID;
 *     Common_MsgCount_t eventUpdate;
 *     Activity_t eventCancellation;
 *     DDateTime_t startDateTime;
 *     struct DDateTime *endDateTime;
 *     struct EventInfo__eventRecurrence {
 *         struct {
 *             struct EventRecurrence **array;
 *             int count;
 *             int size;
 *             void (*free)(struct EventRecurrence *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *eventRecurrence;
 *     ITISgroups_t causeCode;
 *     ITIS_ITIScodes_t *subCauseCode;
 *     struct EventInfo__affectedVehicles {
 *         struct {
 *             ITIS_VehicleGroupAffected_t **array;
 *             int count;
 *             int size;
 *             void (*free)(ITIS_VehicleGroupAffected_t *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *affectedVehicles;
 *     asn_struct_ctx_t _asn_ctx;
 * } EventInfo_t
 * }
 */
public class EventInfo_t extends EventInfo {

    EventInfo_t() {
        // Should not be called directly
    }
}

